import java.util.Scanner;

public class Day18_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search :");
        int key = sc.nextInt();

        int position = -1;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == key) {
                position = a;
                break;
            }
        }
        if (position == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Key element found at index " + position);
        }
    }
}
