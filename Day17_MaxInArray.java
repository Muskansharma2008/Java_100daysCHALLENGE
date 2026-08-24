public class Day17_MaxInArray {

    public static void main(String[] args) {

        int arr[] = { 56, 87, 20, 16, 8 };

        int Max = arr[0];

        for (int a = 1; a < arr.length; a++) {

            if (arr[a] > Max) {
                Max = arr[a];
            }
        }

        System.out.println("Maximum element: " + Max);
    }
}
