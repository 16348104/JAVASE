package NCR.jbcz.eacher;

/**
 * Created by zb on 2018/2/2.
 * 对象作为方法参数
 */
public class Date {
    int year;
    int month;
    int day;

    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public Date() {

    }

    void showDate() {
        System.out.println(year + ',' + month + ',' + day);
    }
}
