import java.io.*;

public class Day48_ReadFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}