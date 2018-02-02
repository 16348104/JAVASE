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
        return birth;
    }

    public static void main(String[] args) {

    }

}
