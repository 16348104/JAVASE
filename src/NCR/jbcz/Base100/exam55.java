package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/21.
 * 统计各个成绩段的人数，分别为<60 >=60 以及<80  >=80
 */
public class exam55 {
    public static void main(String[] args) {
        int score[] = {67, 90, 45, 84, 76, 73, 92, 37};
        int sum1=0, sum2=0, sum3=0;
        int i = 0;
        while (i < score.length) {
            if (score[i] < 60) {
                sum1++;
            } else if (score[i] >= 60 && score[i] < 80) {
                sum2++;
            } else {
                sum3++;
            }
            i++;
        }
        System.out.println("<60: "+sum1+">=60&<80: "+sum2+">=80: "+sum3);
    }
}
