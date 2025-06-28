package _16inputOutput.fileAndPath;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        useFile("testFile.txt");
        usePath("pathFile.txt");
    }

    private static void useFile(String fileName) {
        File file = new File(fileName);
        Boolean fileExists = file.exists();

        System.out.printf("File %s %s\n",
                fileName, fileExists ? "exists." : "does not exists.");

        if (fileExists) {
            System.out.println("Deleting file " + fileName);
            file.delete();
        }

        if (!fileExists) {
            try {
                System.out.println("Creating new file " + fileName);
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
            System.out.println("Created File:" + fileName);

            if (file.canWrite()) {
                System.out.println("Would write to file here");
            }
        }
    }

    private static void usePath(String fileName) {
        Path path = Path.of(fileName);
        boolean pathExists = Files.exists(path);

        System.out.printf("File %s %s\n",
                fileName, pathExists ? "exists." : "does not exists.");

        if (pathExists) {
            System.out.println("Deleting file " + fileName);
            try {
                Files.delete(path);
                pathExists = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!pathExists) {
            try {
                Files.createFile(path);
                System.out.println("Created File: " + fileName);
                if (Files.isWritable(path)) {
                    Files.writeString(path, """
                            Here is some data,
                            For my file,
                            just to prove,
                            Using the Files class and path are better!
                            """);
                }
                System.out.println("And I can read too");
                System.out.println("-------------------------");
                Files.readAllLines(path).forEach(System.out::println);
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
        }
    }
}
