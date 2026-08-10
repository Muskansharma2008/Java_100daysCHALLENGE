public class Day2_variable {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int temp;
        System.out.println("Numbers before swapping");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swapping");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}