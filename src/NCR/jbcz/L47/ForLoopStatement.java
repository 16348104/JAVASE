package NCR.jbcz.L47;

/**
 * Created by dell on 2018/2/18.
 */
public class ForLoopStatement {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i < 10; i++) {
            for (j =1 ; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "   ");
            }
            System.out.println();
        }
    }
}
