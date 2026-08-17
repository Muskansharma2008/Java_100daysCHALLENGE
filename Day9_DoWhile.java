public class Day9_DoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int i = 10;
        do {
            sum = sum + i;
            i--;
        } while (i != 0);
        System.out.println(sum);
    }
}
