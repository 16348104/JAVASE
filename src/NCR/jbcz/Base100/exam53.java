package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/19.
 * 将一个整型变量op1d的二进制的低三位全部变成1
 */
public class exam53 {
    public static void main(String[] args) {
        int op1 = 21;
        int op2 = 3;
        int res;
        res = op1 | op2;
        System.out.println(res);
    }
}
