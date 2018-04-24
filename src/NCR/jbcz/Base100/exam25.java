package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/4/23.
 * 依次输出字符‘4’‘2’和 ‘7’
 */

public class exam25 {
    public static void main(String[] args) {
        char c = '1';
        c = (char) (c + 3);
        System.out.println(c);
        c = (char) (c - 2);
        System.out.println(c);
        c = (char) (c + 5);
        System.out.println(c);
    }
}
