import java.util.Scanner;

public class Day13_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter number");
        int num = sc.nextInt();
        while (num > 1) {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial : " + fact);
    }
}
