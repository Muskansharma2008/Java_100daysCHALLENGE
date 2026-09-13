public class Day34_this {

    int id;
    String name;
    int age;

    // Constructor 1
    Day34_this() {
        this(101, "Muskan", 21);
        System.out.println("Default constructor");
    }

    // Constructor 2
    Day34_this(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor");
    }

    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        Day34_this s = new Day34_this();

        s.display();
    }
}
