package _16inputOutput.fileExceptions2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "testing.csv";
        testFile(fileName);

        File file = new File(fileName);
        if(!file.exists()) {
            System.out.println("I can't run unless this file exists");
            System.out.println("Quitting Application, go figure it out");
            return;
        }
        System.out.println("I am good to go");
    }

    private static void testFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
        } catch (FileNotFoundException e) {
            System.out.println("File" + fileName + " does not exist");
            throw new RuntimeException(e);
        } catch (NullPointerException | IllegalArgumentException badData) {
            System.out.println("User has a bad data " + badData.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Something unexpected happened");
        } finally {
            System.out.println("Maybe I'do log something either way...");
        }
    }
}
