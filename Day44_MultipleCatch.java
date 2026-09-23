// When an exception occurs, Java checks the catch blocks from top to bottom and executes the first matching one.
// After handling the exception, the remaining catch blocks are skipped.
public class Day44_MultipleCatch {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b; // ArithmeticException

            String name = null;
            System.out.println(name.length()); // NullPointerException
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (NullPointerException e) {
            System.out.println("Error: String value is null.");
        }

        System.out.println("Program continues...");
    }
}
