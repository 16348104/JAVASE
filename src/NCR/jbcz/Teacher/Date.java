package NCR.jbcz.Teacher;

/**
 * Created by zb on 2018/2/2.
 */
public class Date {   //对象作类成员
    int year, month, day;

    Date(int y, int m, int d) {//构造方法
        year = y;
        month = m;
        day = d;
    }

    void showDate() {      //显示日期方法
        System.out.println(year + ',' + month + "," + day);
    }

}
