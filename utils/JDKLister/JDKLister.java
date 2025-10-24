package utils.JDKLister;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Utility class to list available JDK installations on the system
 */
public class JDKLister {
    
    private static final String[] COMMON_JDK_PATHS;
    
    static {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            COMMON_JDK_PATHS = new String[] {
                "C:\\Program Files\\Java",
                "C:\\Program Files (x86)\\Java",
                System.getProperty("user.home") + "\\AppData\\Local\\Programs\\Java"
            };
        } else if (os.contains("mac")) {
            COMMON_JDK_PATHS = new String[] {
                "/Library/Java/JavaVirtualMachines",
                "/System/Library/Java/JavaVirtualMachines",
                System.getProperty("user.home") + "/Library/Java/JavaVirtualMachines"
            };
        } else {
            // Linux and other Unix-like systems
            COMMON_JDK_PATHS = new String[] {
                "/usr/lib/jvm",
                "/usr/java",
                "/opt/java",
                "/usr/local/java",
                System.getProperty("user.home") + "/.sdkman/candidates/java"
            };
        }
    }

    /**
     * Lists all JDK installations found on the system
     * 
     * @return List of JDKInfo objects representing found JDK installations
     */
    public static List<JDKInfo> listJDKs() {
        Set<String> foundPaths = new HashSet<>();
        List<JDKInfo> jdks = new ArrayList<>();

        // Add current JAVA_HOME
        String javaHome = System.getProperty("java.home");
        if (javaHome != null) {
            foundPaths.add(javaHome);
            JDKInfo currentJDK = getJDKInfo(javaHome);
            if (currentJDK != null) {
                jdks.add(currentJDK);
            }
        }

        // Search common JDK installation directories
        for (String basePath : COMMON_JDK_PATHS) {
            File baseDir = new File(basePath);
            if (baseDir.exists() && baseDir.isDirectory()) {
                File[] subdirs = baseDir.listFiles(File::isDirectory);
                if (subdirs != null) {
                    for (File subdir : subdirs) {
                        String path = subdir.getAbsolutePath();
                        if (!foundPaths.contains(path) && isJDKDirectory(subdir)) {
                            foundPaths.add(path);
                            JDKInfo jdkInfo = getJDKInfo(path);
                            if (jdkInfo != null) {
                                jdks.add(jdkInfo);
                            }
                        }
                    }
                }
            }
        }

        return jdks;
    }

    /**
     * Checks if a directory contains a JDK installation
     * 
     * @param dir Directory to check
     * @return true if the directory appears to contain a JDK
     */
    private static boolean isJDKDirectory(File dir) {
        // Check for bin directory
        File binDir = new File(dir, "bin");
        if (!binDir.exists() || !binDir.isDirectory()) {
            return false;
        }

        // Check for javac (compiler) - indicates JDK vs JRE
        String javacName = System.getProperty("os.name").toLowerCase().contains("win") 
                          ? "javac.exe" : "javac";
        File javac = new File(binDir, javacName);
        
        return javac.exists();
    }

    /**
     * Gets information about a JDK installation
     * 
     * @param path Path to the JDK directory
     * @return JDKInfo object or null if unable to get information
     */
    private static JDKInfo getJDKInfo(String path) {
        String javaCmd = System.getProperty("os.name").toLowerCase().contains("win") 
                        ? "java.exe" : "java";
        File javaExecutable = new File(path, "bin" + File.separator + javaCmd);
        
        if (!javaExecutable.exists()) {
            return null;
        }

        try {
            ProcessBuilder pb = new ProcessBuilder(javaExecutable.getAbsolutePath(), "-version");
            pb.redirectErrorStream(true);
            Process process = pb.start();
            
            StringBuilder output = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }
            }
            
            process.waitFor();
            
            // Parse version and vendor from output
            String versionOutput = output.toString();
            String version = parseVersion(versionOutput);
            String vendor = parseVendor(versionOutput);
            
            return new JDKInfo(path, version, vendor);
        } catch (IOException | InterruptedException e) {
            return new JDKInfo(path, "Unknown", "Unknown");
        }
    }

    /**
     * Parses the version from java -version output
     * 
     * @param output Output from java -version
     * @return Parsed version string
     */
    private static String parseVersion(String output) {
        // Look for version pattern like "17.0.16" or "1.8.0_292"
        String[] lines = output.split("\n");
        if (lines.length > 0) {
            String firstLine = lines[0];
            // Extract version from quotes
            int start = firstLine.indexOf('"');
            int end = firstLine.lastIndexOf('"');
            if (start != -1 && end != -1 && start < end) {
                return firstLine.substring(start + 1, end);
            }
        }
        return "Unknown";
    }

    /**
     * Parses the vendor from java -version output
     * 
     * @param output Output from java -version
     * @return Parsed vendor string
     */
    private static String parseVendor(String output) {
        String lowerOutput = output.toLowerCase();
        if (lowerOutput.contains("openjdk")) {
            if (lowerOutput.contains("temurin")) {
                return "Eclipse Temurin (OpenJDK)";
            } else if (lowerOutput.contains("zulu")) {
                return "Azul Zulu (OpenJDK)";
            } else if (lowerOutput.contains("corretto")) {
                return "Amazon Corretto (OpenJDK)";
            } else {
                return "OpenJDK";
            }
        } else if (lowerOutput.contains("oracle")) {
            return "Oracle";
        }
        return "Unknown";
    }

    /**
     * Gets the current JDK being used
     * 
     * @return JDKInfo for the current JDK
     */
    public static JDKInfo getCurrentJDK() {
        String javaHome = System.getProperty("java.home");
        return getJDKInfo(javaHome);
    }
}
