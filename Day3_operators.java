import java.util.Scanner;

public class Day3_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter any value between 1 and 4: ");
        int ch = sc.nextInt();
        if ((ch >= 1 || ch <= 4) && ch > 0) {
            switch (ch) {
                case 1:
                    System.out.println("Addition: " + (a + b));
                case 2:
                    System.out.println("Subtraction: " + (a - b));
                case 3:
                    System.out.println("Multiplication: " + (a * b));
                case 4:
                    System.out.println("Division: " + (a / b));
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
