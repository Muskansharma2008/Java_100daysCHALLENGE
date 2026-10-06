import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Day56_Comparator {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Rahul", 75));
        list.add(new Student("Aman", 90));
        list.add(new Student("Priya", 80));

        // Custom sorting by marks
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        });

        for (Student s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
