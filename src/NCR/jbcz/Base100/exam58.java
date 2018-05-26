package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/26.
 * 判断score[]={89,93,60,59,78,91}中是否所有人的成绩都超过了80分，如果有人没有超过，则显示提示信息“有人未超过80分！”
 * 否则显示“全部超过80分！”
 */
public class exam58 {
    public static void main(String[] args) {
        int score[] = {89, 93, 60, 59, 78, 91};
        int i = 0;
        while (i < score.length) {
            if (score[i] < 80) {
                continue;
            }
            i++;
            if (i > 0) {
                System.out.println("有人未超过80分");
            } else {
                System.out.println("全部超过80分");
            }
        }
    }


}
