package NCR.jbcz.L8_3;

/**
 * Created by zb on 2018/3/9.
 */
public class Hello extends Thread {
    int i;

    public void run() {
        while (true) {
            System.out.println("hello" + i++);
            if (i == 5) {
                break;
            }
        }
    }
}