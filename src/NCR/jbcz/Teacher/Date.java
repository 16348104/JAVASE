package NCR.jbcz.Teacher;

/**
 * Created by zb on 2018/2/2.
 */
public class Date {   //对象作类成员
    int year,month,day;
    Date(int y,int m,int d) {
        year=y;
        month=m;
        day=d;
    }
    void showDate(){
        System.out.println(year+','+month+","+day);
    }

}
