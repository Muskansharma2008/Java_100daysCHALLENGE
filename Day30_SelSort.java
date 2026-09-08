public class Day30_SelSort {
    public static void main(String[] args) {

        int arr[] = { 5, 3, 8, 4, 2 };

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        // Print sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
