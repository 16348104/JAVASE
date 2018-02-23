package NCR.jbcz.L57;

import java.util.*;
import java.math.*;

/**
 * Created by dell on 2018/2/23.
 */
public class Employee {
    private static int nextId;//静态整数
    private int id;
    private String name = "";
    private double salary;

    static {      //静态初始化块
        Random generator = new Random();//随机数对象
        nextId = generator.nextInt(10000);//10000内的随机数
    }

    {
        id = nextId;
        nextId++;

    }

    public Employee() {//0个参数的构造函数
        //name默认值为"" salary默认值0  id号由静态初始化块获得
    }

    public Employee(double s) {   //1个参数的构造函数
        this("Employee #" + nextId, s);//this关键字可以从构造函数中调用其他构造方法
    }

    public Employee(String n, double s) {//2个参数的构造函数
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
