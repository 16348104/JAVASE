package NCR.jbcz.L8_2;

/**
 * Created by zb on 2018/3/7.
 */
public class Hello extends Thread {
    int i;

    public void run() {
        while (true) {
            System.out.println("Hello" + i++);
            if (i == 5) {
                break;
            }
        }
    }
}