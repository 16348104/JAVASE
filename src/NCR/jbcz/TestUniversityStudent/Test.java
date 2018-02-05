package NCR.jbcz.TestUniversityStudent;

/**
 * Created by zb on 2018/2/5.
 */
public class Test {
    public static void main(String[] args) {
        UniversityStudent us = new UniversityStudent("张三", "计算机系", "清华大学");
        System.out.println("名字:"+us.name+ " 院系：" + us.department + " 大学：" + us.unversity);
    }
}
