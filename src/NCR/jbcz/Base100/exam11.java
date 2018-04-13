package NCR.jbcz.Base100;

/**
 * Created by zb on 2018/4/12.
 * 随机产生若干字母a-z,直到出现字母停止
 */
public class exam11 {
    public static void main(String[] args) {
        char c;
        do {
            c = (int) ((Math.random() * 26) + 'A');
            System.out.println(c + "");
        } while (c != 'Q');
    }
}