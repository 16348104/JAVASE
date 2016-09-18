package hello;
import java.util.Scanner;

/**
 * Created by zb on 2016/9/18.
 * 最大公约数-辗转相除法
 */
public class ga {
    public static void main(String[] args) {
        System.out.println("请输入两个整数： ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int t=0;
        int A = a;
        int B = b;
        while (b!=0) {
            t = a % b;
            a = b;
            b = t;
        }
        System.out.println(A+"和"+B+"的最大公约数是："+a);
    }
}
