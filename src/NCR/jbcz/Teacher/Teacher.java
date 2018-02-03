package NCR.jbcz.Teacher;

/**
 * Created by zb on 2018/2/2.
 */
public class Teacher {
    private String name;
    private Date birth;//

    void setTeacher(String t1, int y, int m, int d) {
        name = t1;
        birth = new Date(y, m, d);
    }

    Date getBirth() {
        return birth;          //定义get方法作为返回birth变量值
    }


    public static void main(String[] args) {
        Teacher teacher = new Teacher();//创建对象
        teacher.setTeacher("邓小平", 1970, 8, 9);//调用set方法初始化
        System.out.print("邓小平的生日：");
        teacher.getBirth().showDate();//调用get方法返回birth对象，再调用对象show方法显示生日；
    }

}
