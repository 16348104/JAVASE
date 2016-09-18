package hello;
import java.util.Scanner;
/**
 * Created by zb on 2016/9/18.
 * s=1-1/2+1/3-1/4+1/n......
 */
public class sum {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double  sign=1.0;
        double s = 0.0;
        for (int i = 1; i <=n; i++,sign=-sign) {
            s = s + sign/i;
        }
        System.out.println("s="+s);
    }
}
