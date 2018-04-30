package NCR.jbcz.Base100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by dell on 2018/4/30.
 * 随机产生一个1-10间的随机数,根据提示用户可以猜这个随机数.
 * 例如,程序随机产生的随机数是7,如果输入8,则提示"Try smaller..."并继续提示输入,
 * 如果输入6,则提示"Try bigger..."并继续提示输入,
 * 如果输入7,则输出"Great!"并退出程序.
 */
public class exam29 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader;
        BufferedReader in;
        inputStreamReader = new InputStreamReader(System.in);
        in = new BufferedReader(inputStreamReader);
        int ranNum = (int) (Math.random() * 10);/**随机数*/
        int guessNum = -1;
        String str;
        while (ranNum != guessNum) {
            System.out.println("Please Input:");
            try {
                str = in.readLine();
                guessNum = Integer.parseInt(str);
            } catch (Exception e) {

            }
            if (guessNum > ranNum) {
                System.out.println("Try smaller");
            } else {
                System.out.println("Try bigger");
            }
        }
        System.out.println("Great!");
    }
}
