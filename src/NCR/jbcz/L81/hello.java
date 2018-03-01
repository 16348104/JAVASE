package NCR.jbcz.L81;

/**
 * Created by zb on 2018/3/1.
 */
public class hello implements Runnable {
    int i;

    public void run() {
        while (true) {
            System.out.println("Hello" + i++);
            if (i == 5)
                break;
        }
    }
}