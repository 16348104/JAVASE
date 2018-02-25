package NCR.jbcz.L510;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by zb on 2018/2/25.
 */
public class Employee extends Person {  //继承抽象类的子类
    private double salary;
    private Date hireDay;

    @Override
    public String getDescription() { //实现抽象方法
        return String.format("公司雇员，年薪是￥%.2f。", salary);
    }

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();

    }
}