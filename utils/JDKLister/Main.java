package utils.JDKLister;

import java.util.List;

/**
 * Main class to demonstrate JDK listing functionality
 * 
 * This utility lists all JDK installations found on the system.
 * It searches common JDK installation directories and displays
 * information about each found JDK including path, version, and vendor.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== JDK Lister ===");
        System.out.println("Searching for JDK installations on the system...\n");
        
        // Get current JDK
        JDKInfo currentJDK = JDKLister.getCurrentJDK();
        if (currentJDK != null) {
            System.out.println("Current JDK (JAVA_HOME):");
            System.out.println("  " + currentJDK);
            System.out.println();
        }
        
        // List all JDKs
        List<JDKInfo> jdks = JDKLister.listJDKs();
        
        if (jdks.isEmpty()) {
            System.out.println("No JDK installations found.");
        } else {
            System.out.println("Found " + jdks.size() + " JDK installation(s):");
            System.out.println();
            
            int count = 1;
            for (JDKInfo jdk : jdks) {
                System.out.println(count + ". " + jdk);
                count++;
            }
        }
        
        System.out.println("\n=== End of JDK List ===");
    }
}
