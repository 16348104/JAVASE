package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/7/29.
 *
 * 求1-20间所有奇数的和，并打印输出最终结果
 * 奇数%2!=0   偶数%2==0
 */
public class exam68 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum:" + sum);
    }
}
