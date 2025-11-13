import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Person> students = new ArrayList<>();
        students.add(new Person(2, 21, "yassine"));
        students.add(new Person(6, 23, "souha"));
        students.add(new Person(1, 23, "Ahmed"));
        students.add(new Person(2, 21, "hedi"));
        students.add(new Person(3, 23, "nessrine"));
        students.add(new Person(5, 22, "Ayoub"));
        System.out.println(students);
        System.out.println("------------------");
        Collections.sort(students);
        System.out.println("contains person : " +
                students.contains(new Person(6, 23, "souha")));
        System.out.println("first tri " + students);
        System.out.println("------------------");
        Comparator<Person> nameCreteria = (o1, o2) -> o2.getName().compareTo(o1.getName());
        Comparator<Person> idCreteria = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getId() - o1.getId();
            }
        };
        Collections.sort(students,  (o1, o2) -> o2.getName().compareTo(o1.getName()));

        System.out.println("second tri " + students);


    }
}