class Animal {
    void sound() {
        System.out.println("Sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barks");
    }
}

public class Day36_Inheritance {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
        a.bark();
    }
}
