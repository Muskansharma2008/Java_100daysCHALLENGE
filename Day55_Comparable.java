import java.util.*;

class Students implements Comparable<Students> {
    int marks;

    Students(int marks) {
        this.marks = marks;
    }

    public int compareTo(Students s) {
        return this.marks - s.marks;
    }
}

public class Day55_Comparable {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();

        list.add(new Students(80));
        list.add(new Students(60));
        list.add(new Students(90));

        Collections.sort(list);

        for (Students s : list) {
            System.out.println(s.marks);
        }
    }
}
