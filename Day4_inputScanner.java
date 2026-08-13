import java.util.Scanner;

public class Day4_inputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        double m = sc.nextDouble();
        System.out.println("Enter 2nd number:");
        double n = sc.nextDouble();
        double sum = m + n;
        System.out.println("Sum of numbers: " + sum);
    }
}