package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/1.
 * 计算两个整数25和7的商和余数.
 */
public class exam32 {
    public static void main(String[] args) {
        int num1, num2;
        int result1, result2;
        num1 = 25;
        num2 = 7;
        result1 = num1 / num2;
        result2 = num1 % num2;
        System.out.println(num1+"/"+num2+"的商:"+result1+"  余:"+result2);
    }

}
