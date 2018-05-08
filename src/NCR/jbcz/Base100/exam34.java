package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/8.
 * 将字符串Tadf$asdf&&*,[]qwer242
 * 中非字母的字符打印出来
 */
public class exam34 {
    public static void main(String[] args) {
        String str = "Tadf$asdf&&*,[]qwer242";
        int i;
        for (i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
                System.out.print(c);
            }
        }
    }

}
