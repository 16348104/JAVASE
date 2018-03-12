package NCR.jbcz.TEST;

/**
 * Created by zb on 2018/3/12.
 */
public class Test {
    public static void main(String[] args) {
        TestThread pm1 = new TestThread("one");
        pm1.start();
        TestThread pm2 = new TestThread("two");
        pm2.start();
    }
}