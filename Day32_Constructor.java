public class Day32_Constructor {
    String name;
    int age;

    Day32_Constructor(String n, int a) {
        this.name = n;
        this.age = a;
    }
    public static void main(String[] args) {
        Day32_Constructor d = new Day32_Constructor("Muskan", 0);
        System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);
    }
}