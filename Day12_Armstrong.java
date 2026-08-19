import java.util.Scanner;

public class Day12_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int sum = 0;
        int digits = 0;
        int original = num;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (original == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
