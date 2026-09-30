import java.util.LinkedList;

public class Day51_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("SQL");

        System.out.println("Elements of LinkedList:");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
