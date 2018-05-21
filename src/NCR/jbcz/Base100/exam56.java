package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/22.
 * 打印1-9的乘法表
 */
public class exam56 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + i * j + "  ");
            }
            System.out.println();
        }
    }
}
