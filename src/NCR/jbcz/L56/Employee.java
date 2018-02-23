package NCR.jbcz.L56;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by xdx on 2018/2/23.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    @Override
    public boolean equals(Object otherobj) {  //对于object方法覆盖
        if (this == otherobj) {
            return true;
        }
        if (otherobj == null) {
            return false;
        }
        if (getClass() != otherobj.getClass()) {
            return false;
        }
        Employee other = (Employee) otherobj;
        return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);
    }

    @Override
    public int hashCode() {  //对于object方法覆盖
        return 7 * name.hashCode()+11*new Double(salary).hashCode()+13*hireDay.hashCode();
    }

    @Override
    public String toString() {    //对于object的方法覆盖
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
