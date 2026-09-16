class Animal {
    void sound() {
        System.out.println("Sound");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }
}

public class Day36_Inheritance {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.sound();
        a.meow();
    }
}
