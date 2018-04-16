package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/15.
 * 获取字符串"China"的长度和最后一个字符,并输出这些信息
 */
public class exam17 {
    public static void main(String[] args) {
        String str = null;
        str = "China";
        int n = 0;
        n = str.length();
        char c;
        c = str.charAt(n - 1);
        System.out.println("字符串中共有" + n + "个字符,最后一个字符是:" + c);
    }
}
