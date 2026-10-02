import java.util.HashMap;

public class Day53_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Aman");

        System.out.println(students);
        System.out.println(students.get(103));
    }
}