package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/8.
 * 算出整数365的个位数字,十位字,百位数字,并打印输出.
 */
public class exam36 {
    public static void main(String[] args) {

        int num = 365;
        int a, b, c;
        int temp = num;
        a=temp/100;
        temp = temp - a * 100;
        b=temp/10;
        c=temp%10;
        System.out.println(num + ",百位数字:" + a + ",十位数字:" + b + ",个位数字:" + c);
    }
}
