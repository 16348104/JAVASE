package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/4/9.
 * 输出0-20之间所有奇数的和
 */
public class exam8 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 20) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("sum= " + sum);
    }
}
