package NCR.jbcz.Base100;

import sun.print.SunMinMaxPage;

/**
 * Created by xdx on 2018/6/3.
 * 求前20个自然数中所有能被3整除的数的和，并打印输出结果
 */
public class exam62 {
    public static void main(String[] args) {
        long sum=0;
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum:" + sum);
    }
}
