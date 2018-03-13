package NCR.jbcz.L5_10;

/**
 * Created by zb on 2018/2/25.
 */
public class Student extends Person {//继承抽象类的子类
    private String major;

    public Student(String n, String m) {
        super(n);
        major = m;
    }

    @Override
    public String getDescription() {//实现抽象方法
        return "大学生，专业是" + major + "。";
    }
}