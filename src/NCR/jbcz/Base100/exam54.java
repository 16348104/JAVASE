package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/19.
 * 将整数变量op1的二进制第4位(从低位开始计算)数进行翻转(即如果是1则变成0,如果是0则变成1)
 */
public class exam54 {
    public static void main(String[] args) {
        int op1=21;
        int op2=8;
        op1=op1^op2;
        System.out.println(op1);
    }
}
