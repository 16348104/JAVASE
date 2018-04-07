package NCR.jbcz.Base100;
/**
 * Created by dell on 2018/4/7.
 * 判断1990\2000\2008是否是闰年
 */
public class exam2 {
    public static void main(String[] args) {
        yes_no(1990);
        yes_no(2000);
        yes_no(2008);

    }

    private static void yes_no(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "是闰年");
            } else {
            System.out.println(year + "不是闰年");

        }
    }
}
