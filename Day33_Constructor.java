public class Day33_Constructor {
    String name;
    int age;

    Day33_Constructor(String n, int a) {
        this.name = n;
        this.age = a;
    }
    public static void main(String[] args) {
        Day33_Constructor d = new Day33_Constructor("Muskan", 18);
        System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);
    }
}