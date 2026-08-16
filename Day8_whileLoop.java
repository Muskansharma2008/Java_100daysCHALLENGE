public class Day8_whileLoop {
    public static void main(String[] args) {
        int num = 5676;
        int r;
        int n1 = 0;
        while (num != 0) {
            r = num % 10;
            n1 = 10 * n1 + r;
            num = num / 10;
        }
        System.out.println("Reverse number : " + n1);
    }
}
