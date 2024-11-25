package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void readLargeFile() {
        String filename = "very_large_file.txt";
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            String content = new String(inputBytes);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}