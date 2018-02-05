package NCR.jbcz.TestUniversityStudent;

/**
 * Created by zb on 2018/2/5.
 */
public class UniversityStudent extends Student {
    String unversity;

    public UniversityStudent(String name, String department, String unversity) {
        super(name, department);
        this.unversity = unversity;
    }
}

