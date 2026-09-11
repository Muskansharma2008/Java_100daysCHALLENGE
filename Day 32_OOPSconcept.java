// Program to demonstrate Class and Object

class Student {

    // Data members
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Day32_OOPSconcept {
    public static void main(String[] args) {

        // Creating an object of Student class
        Student s1 = new Student();

        // Assigning values
        s1.name = "Muskan";
        s1.age = 20;

        // Calling method using object
        s1.display();
    }
}


