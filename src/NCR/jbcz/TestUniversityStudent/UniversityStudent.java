package NCR.jbcz.TestUniversityStudent;

/**
 * Created by zb on 2018/2/5.
 */
public class UniversityStudent extends Student {
    String university;

    public UniversityStudent(String name, String department, String university) {
        super(name, department);
        this.university = university;
    }
}

