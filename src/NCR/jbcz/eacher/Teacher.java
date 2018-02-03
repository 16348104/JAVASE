package NCR.jbcz.eacher;


/**
 * Created by zb on 2018/2/2.
 * 显示教师生日的应用程序
 */
public class Teacher {

    String name;
    Date birth;

    void setTeacher(String t1, int y, int m, int d) {
        name = t1;
        birth = new Date(y, m, d);//在set方法中创建Date对象
    }

    void showTeacher() {
        System.out.println("名字：" + name);
        System.out.print("生日：");
        birth.showDate();//在show方法中调用birth的show方法
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setTeacher("张闻", 1968, 6, 18);
        teacher.showTeacher();
    }
}
