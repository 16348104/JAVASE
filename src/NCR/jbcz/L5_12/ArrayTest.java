package NCR.jbcz.L5_12;

/**
 * Created by zb on 2018/2/25.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int i;
        int a[] = new int[5];
        for (i = 0; i < 5; i++) {
            a[i] = i;
        }
        for (i = a.length - 1; i >= 0; i--) {
            System.out.print("a[" + i + "]=" + a[i] + "  ");
        }
    }
}