import java.util.Scanner;

public class Day15_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2D array
        System.out.println("Enter number of rows: ");
        int i = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int j = sc.nextInt();
        int arr[][] = new int[i][j];
        System.out.println("Enter elements:");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                arr[a][b] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Display matrix:");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                System.out.print(arr[a][b] + "  ");
            }
            System.out.println();
        }
    }
}
