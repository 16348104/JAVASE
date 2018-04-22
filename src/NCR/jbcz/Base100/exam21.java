package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/4/22.
 * 依次输出26个字母，即
 * A-Z
 */
public class exam21 {
    public static void main(String[] args) {
        int i;
        char c = 'A';
        for (i = 0; i < 26; i++) {
            System.out.println(c + " ");
            c = (char) (c + 1);
        }
    }
}
