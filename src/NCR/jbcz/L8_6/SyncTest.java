package NCR.jbcz.L8_6;

/**
 * Created by dell on 2018/3/11.
 */
public class SyncTest {
    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        Producer p1 = new Producer(stack);
        Thread prodT1 = new Thread(p1);
        prodT1.start();
        Producer p2 = new Producer(stack);
        Thread prodT2 = new Thread(p2);
        prodT2.start();
        Consumer c1 = new Consumer(stack);
        Thread conT1 = new Thread(c1);
        conT1.start();
        Consumer c2 = new Consumer(stack);
        Thread conT2 = new Thread(c2);
        conT2.start();
    }
}
