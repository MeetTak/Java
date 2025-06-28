package _16inputOutput.fileException3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current working directory(pwd):" + new File("").getAbsolutePath());
        String fileName = "files/testing.csv";

//        File file = new File( parent:".", filename);
        File file = new File(new File("").getAbsolutePath(), fileName);
        if(!file.exists()) {
            System.out.println("I can't run until this file exist");
            return;
        }
        System.out.println("I am good to go");

        for(File f : File.listRoots()) {
            System.out.println(f);
        }

        Path path = Paths.get("files/testing.csv");
        System.out.println(file.getAbsolutePath());
        if(!Files.exists(path)) {
            System.out.println("2. I can't run until this file exist.");
            return;
        }
        System.out.println("2. I am good to go");
    }
}
