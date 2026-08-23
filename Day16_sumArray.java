public class Day16_sumArray {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}