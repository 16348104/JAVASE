package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/28.
 * 定义一个Add(),用于求两个数的和.
 */
public class exam28 {

    public static void main(String[] args) {
        int a = 24, b = 34;
        System.out.println(Add(a, b));

    }

    private static long Add(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }
}
