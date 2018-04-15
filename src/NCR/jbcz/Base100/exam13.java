package NCR.jbcz.Base100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dell on 2018/4/14.
 * 输入年份,判断是否闰年
 */
public class exam13 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int year = 1900;
        System.out.print("请输入年份:");
        try {
            String s = in.readLine();
            year = Integer.parseInt(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (year % 400 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年.");
        } else {
            System.out.println(year + "不是闰年.");
        }
    }


}
