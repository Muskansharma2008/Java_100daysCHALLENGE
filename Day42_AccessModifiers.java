class Student {

    // Public variable
    public String name = "Muskaan";

    // Private variable
    private int age = 20;

    // Public method to access private variable
    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

public class Day42_AccessModifiers {
    public static void main(String[] args) {

        Student s = new Student();

        // Public variable can be accessed directly
        System.out.println("Name: " + s.name);

        // Private variable cannot be accessed directly
        // System.out.println(s.age);  // Error

        // Private variable can be accessed through public method
        s.displayAge();
    }
}