import java.util.Scanner;

public class Day26_EfficientReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println("Reversed String: " + sb);

        sc.close();
    }
}