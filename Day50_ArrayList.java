import java.util.ArrayList;

public class Day50_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After adding: " + fruits);

        // Remove element by value
        fruits.remove("Banana");

        System.out.println("After removing: " + fruits);

        // Add element at a specific index
        fruits.add(1, "Orange");

        System.out.println("After adding at index 1: " + fruits);

        // Remove element by index
        fruits.remove(0);

        System.out.println("After removing index 0: " + fruits);
    }
}