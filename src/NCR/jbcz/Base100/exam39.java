package NCR.jbcz.Base100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dell on 2018/5/8.
 * 将输入的字符串转换为实数，并打印输出。
 */
public class exam39 {
    public static void main(String[] args) {
        InputStreamReader ir;
        BufferedReader in;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        double d=0.0;
        System.out.print("请输入一个实数；");
        try {
            String s = in.readLine();
            d = Double.parseDouble(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("你输入的实数是："+d);
    }

}
