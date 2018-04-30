package NCR.jbcz.Base100;

import sun.security.util.Length;

/**
 * Created by dell on 2018/4/30.
 * 找出字符串"My name is Tom,I come from China."中的大写字母,并打印出来
 */
public class exam31 {
    public static void main(String[] args) {
        String str = "My name is Tom,I come from China.";
        int i = 0;
        int len = str.length();
        while (i < len) {
            char c = str.charAt(i);
            if (c > 'A' && c < 'Z') {
                System.out.print(c + "  ");
            }
            i++;
        }
    }
}
