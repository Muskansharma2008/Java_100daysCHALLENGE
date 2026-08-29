public class Day21_MethodOverloading {
    int a,b,c;
    Day21_MethodOverloading(int x, int y, int z) {
        this.a=x;
        this.b=y;
        this.c=z;
    }
    public void Square(int x,int y) {
        int sum= (x*x) + (y*y);
        System.out.println("Two number sum : " + sum);
    }
    public void Square(int x,int y,int z) {
        int sum1= (x*x) + (y*y) + (z*z);
        System.out.println("Three number sum : " + sum1);
    }
    public static void main(String[] args) {
        Day21_MethodOverloading mo = new Day21_MethodOverloading(2,3,4);
        mo.Square(2,3);
        mo.Square(2,3,4);
    }
}
