package NCR.jbcz;


/**
 * Created by zb on 2018/2/5.
 */
public class AutTypeTransition {
    public static void main(String[] args) {
        char a = 'h';
        byte b = 6;
        int i = 100;
        long l = 567L;
        float f = 8.99F;
        double d = 4.7788;
        int aa = a + i; //a自动转换为int
        long ll = l - aa;//aa自动转换long
        float ff = b * f;//b自动转换为float
        double dd = ff / aa + d;//aa自动转换为float类型后运算ff/aa得float结果后自动转换为double类型
        System.out.println("aa=" + aa);
        System.out.println("ll=" + ll);
        System.out.println("ff=" + ff);
        System.out.println("dd=" + dd);
    }
}

//byte--int--long-float--double
