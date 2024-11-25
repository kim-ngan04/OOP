package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void readLargeFile() {
        String filename = "very_large_file.txt";
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            StringBuilder sb = new StringBuilder();
            for (byte b : inputBytes) {
                sb.append((char)b);
            }
            String content = sb.toString();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}