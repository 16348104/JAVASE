package NCR.jbcz.L46;

/**
 * Created by dell on 2018/2/17.
 * 随机产生若干字母(A-Z),直到出现字母Z
 */
public class DoWhileStatement {
    public static void main(String[] args) {
//        char c = (char) ('A' + (int) (Math.random() * 26));
        char c = 'A';
        System.out.print(c + ',');
     /*   do {
            c = (char) ('A' + (int) (Math.random() * 26));
            System.out.print(c + ',');
        } while (c != 'Z');*/
    }
}
