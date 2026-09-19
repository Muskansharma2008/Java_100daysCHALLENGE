interface Father {
    void property();
}

interface Mother {
    void love();
}

class Child implements Father, Mother {

    public void property() {
        System.out.println("Father's Property");
    }

    public void love() {
        System.out.println("Mother's Love");
    }
}

public class Day40_MultipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.property();
        c.love();
    }
}
