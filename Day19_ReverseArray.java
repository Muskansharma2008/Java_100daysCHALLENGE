public class Day19_ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int start = 0;
        int end = (arr.length - 1);
        while (start < end) {
            arr[start] = arr[end];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Reversed array : " + arr[i]);
        }
    }
}
