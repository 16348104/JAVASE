package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/30.
 * 统计不及格的人数,分数有56,90,89,23,45,61,60,59
 */
public class exam30 {
    public static void main(String[] args) {
        int[] score = {56, 90, 89, 23, 45, 61, 60, 59};
        int num = 0;
        int sum = 0;
        int i = 0;
        while (i < 8) {
            if (score[i] < 60) {
                sum++;
            }
            i++;
        }
        System.out.println("<60:" + sum);
    }
}



