package NCR.jbcz.Base100;

import sun.print.SunMinMaxPage;

/**
 * Created by xdx on 2018/4/22.
 * 计算自然数1-20的和
 */
public class exam22 {
    public static void main(String[] args) {
        int n = 20;
        long sum=0;
        do {
            sum = sum + n;
            n--;
        } while (n > 0);
        System.out.println("sum=" + sum);
    }
}
