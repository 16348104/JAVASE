package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/25.
 * 统计score[]={37,89,63,60,59,78,91}中成绩不及格的人数
 */
public class exam57 {
    public static void main(String[] args) {
        int score[] = {37, 89, 63, 60, 59, 78, 91};
        int sum = 0;
        int i = 0;
        while (i < score.length) {
            if (score[i] >= 60) {
                i++;
                continue;
            }
            sum++;
            i++;
        }
        System.out.println("below 60 sum:" + sum);
    }
}
