package NCR.jbcz.Base100;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dell on 2018/4/14.
 * 输入月份判断该月份的天数,如果是2月份则天数按28天计算
 */
public class exam14 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader;
        BufferedReader in;
        inputStreamReader = new InputStreamReader(System.in);
        in = new BufferedReader(inputStreamReader);
        int month = 1;
        int day = 0;
        System.out.print("请输入月份:");
        try {
            String s = in.readLine();
            month = Integer.parseInt(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                day = 28;

        }
        System.out.println(month + "月有" + day + "天。");
    }
}

