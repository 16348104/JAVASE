package NCR.jbcz.L510;

/**
 * Created by zb on 2018/2/25.
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("张浩", 5000, 1989, 10, 1);
        people[1] = new Student("李明", "计算机科学");
        for (Person person : people) {
            System.out.println(person.getName() + "," + person.getDescription());
        }
    }

}