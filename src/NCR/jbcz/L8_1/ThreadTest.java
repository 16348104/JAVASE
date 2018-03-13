package NCR.jbcz.L8_1;

/**
 * Created by zb on 2018/3/1.
 * 多线程
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new hello());
        Thread t2 = new Thread(new hello());
        t1.start();
        t2.start();
    }
}