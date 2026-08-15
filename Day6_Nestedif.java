import java.util.Scanner;

public class Day6_Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int A = sc.nextInt();
        System.out.println("Enter B:");
        int B = sc.nextInt();
        System.out.println("Enter C:");
        int C = sc.nextInt();
        if (A > B) {
            if (A > C) {
                System.out.println("A is larger than B and C");
            } else {
                System.out.println("C is larger than A and B");
            }
        } else {
            if (B > C) {
                System.out.println("B is larger than A and C");
            }
        }
    }
}
