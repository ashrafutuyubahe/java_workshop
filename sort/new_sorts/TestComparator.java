import java.util.*;

public class TestComparator {

    public static void main(String[] a) {
        List<Student> people = new ArrayList<>();
        people.add(new Student(19, "Alice"));
        people.add(new Student(10, "Bob"));
        people.add(new Student(2, "Charlie"));

        System.out.println("before sorting");

        for (Student st : people) {
            System.out.println(st);
        }

        Collections.sort(people, new customComparator());
        System.out.println("after soring  ");

        System.out.println("after sorting:  ");
        for (Student st : people) {
            System.out.println(st);
        }

    }
}
