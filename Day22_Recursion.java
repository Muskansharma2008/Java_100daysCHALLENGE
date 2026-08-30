public class Day22_Recursion {

    public int factorial(int x) {

        // Base condition
        if (x == 0 || x == 1) {
            return 1;
        }

        // Recursive call
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {

        int x = 4;

        Day22_Recursion d = new Day22_Recursion();

        int result = d.factorial(x);

        System.out.println("Factorial of " + x + " = " + result);
    }
}