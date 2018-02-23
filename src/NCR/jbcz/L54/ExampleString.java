package NCR.jbcz.L54;

/**
 * Created by xdx on 2018/2/23.
 */
public class ExampleString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("test");
        System.out.println("buffer=" + sb);
        System.out.println("length=" + sb.length());
        System.out.println("capacity="+sb.capacity());
    }
}
