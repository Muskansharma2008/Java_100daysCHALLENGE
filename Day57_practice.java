import java.util.*;

public class Day57_practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Muskan");
        students.add("Priya");

        Collections.sort(students);

        System.out.println("Sorted Student List:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}
