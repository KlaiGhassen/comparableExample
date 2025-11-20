import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<Person> students = new HashSet<>();
        students.add(new Person(2, 21, "yassine"));
        students.add(new Person(6, 23, "souha"));
        students.add(new Person(1, 24, "Ahmed"));
        students.add(new Person(2, 21, "hedi"));
        students.add(new Person(3, 23, "nessrine"));
        students.add(new Person(5, 22, "Ayoub"));
        System.out.println(students);
        System.out.println("--------------------------");
        students = new TreeSet<>(students);
        System.out.println(students);

    }
}