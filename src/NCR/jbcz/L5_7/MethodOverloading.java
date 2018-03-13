package NCR.jbcz.L5_7;

/**
 * Created by dell on 2018/2/23.
 * 重载方法,简单多态
 */
public class MethodOverloading {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("张浩", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}
