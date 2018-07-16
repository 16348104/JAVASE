package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/6/5.
 * 将字符串str（"Welcome to China!"）转化为一个字符数组c
 * 然后将字符数组按数组下标逆序输出
 */
public class exam65 {
    public static void main(String[] args) {
        String str = "Welcome to China!";
        char c[];
        c = new char[str.length()];
        str.getChars(0, str.length(), c, 0);
        int i;
        for (i = c.length - 1; i >= 0; i--) {
            System.out.println(c[i]);
        }
    }
}
