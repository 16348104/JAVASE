package NCR.jbcz.L4_9;

/**
 * Created by dell on 2018/2/18.
 * 产生一个随机数(100-200)求出其因子(求一个数的所有因子采用穷举法:对1、n)
 */
public class ContinueStatement {
    public static void main(String[] args) {
        int n;
        n = 100 + (int) (Math.random() * 100);
        System.out.print(n + " 的所有因子包括:");
        for (int i = 1; i <= n; i++) {
            if (n % i != 0) {
                continue;
            }
            System.out.print(i + ",");
        }
        System.out.println();

    }
}
