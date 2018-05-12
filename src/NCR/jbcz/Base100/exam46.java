package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/12.
 * 统计成绩及格的学生的平均分。
 * 学生分数分别是59, 60, 48, 73, 92, 69, 34, 85
 */
public class exam46 {
    public static void main(String[] args) {
        int[] score = {59, 60, 48, 73, 92, 69, 34, 85};
        int l = score.length;
        double sum = 0.0;
        int num = 0;
        int i = 0;
        while (i < l) {
            if (score[i] >= 60) {
                sum = sum + score[i];
                num++;
            }
            i++;
        }
        double arerage = sum / num;
        System.out.println("The average:" + arerage);
    }
}
