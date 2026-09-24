import java.util.Scanner;

public class Day45_FinallyBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Hello, " + name);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            sc.close();
            System.out.println("Scanner resource closed.");
        }
    }
}
