package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/15.
 * 将字符串“Welcome to China!”转化为字符数组，并打印输出。
 */
public class exam49 {
    public static void main(String[] args) {
        String str = "Welcome to China!";
        char ch[];
        ch = new char[str.length()];
        ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i]);
    }
}
