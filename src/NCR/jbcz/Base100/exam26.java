package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/24.
 * 比较三个数(13,25,6)的大小,将最小的数输出。
 */
public class exam26 {
    public static void main(String[] args) {
        int a = 13, b = 35, c = 6;
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("min=" + min);


    }
}


