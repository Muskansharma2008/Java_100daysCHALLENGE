class Animal() {
    void ab() {
        System.out.println("Sound");
    }
}
class Dog extends Animal {
    void ab() {
        System.out.println("Barks");
    }
}
public class Day36_Inheritance {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.ab();
    }
}
