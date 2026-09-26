import java.io.FileWriter;
import java.io.IOException;

public class Day47_FileHandling {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello, this is my first file handling program.");
            writer.write("\nI am learning Java.");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}