package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/8.
 * 求一个实数37.13的整数部分和小数部分,并打印输出
 */
public class exam35 {
    public static void main(String[] args) {
        double d = 37.13;
        int i;
        i = (int) d;
//        System.out.println(i);
        double x;
        x = d - i;
        System.out.println(d + "整数部分:" + i + ",小数部分:" + x);
    }
}
