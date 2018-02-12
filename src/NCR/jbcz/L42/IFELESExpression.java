package NCR.jbcz.L42;

import static java.lang.Math.random;

/**
 * Created by dell on 2018/2/12.
 * 闰年的年份被4整除而不能被100整除,或者能被400整除.
 */
public class IFELESExpression {
    public static void main(String[] args) {
        int y = (int) (random() * 2000) + 1;
        if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
            System.out.println(y + "年不是闰年");
        } else {
            System.out.println(y + "年不是闰年");
        }

    }
}
