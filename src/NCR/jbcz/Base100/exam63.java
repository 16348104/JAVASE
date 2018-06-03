package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/6/3.
 * 随机产生‘0’-‘9’字符，直到产生的字符是‘5’是结束
 */
public class exam63 {
    public static void main(String[] args) {
        while (true) {
            int i = (int) (Math.random() * 10);
            char c;
            c = (char) ('0' + i);
            System.out.print(c + ",");
            if (c == '5') {
                break;
            }
        }
    }
}
