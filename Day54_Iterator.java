import java.util.ArrayList;
import java.util.Iterator;

public class Day54_Iterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Aman");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}