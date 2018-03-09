package NCR.jbcz.L84;


/**
 * Created by zb on 2018/3/9.
 */
public class Hello implements Runnable {
    int i = 0;
    private boolean timeToQuit = false;


    @Override
    //每隔10ms输出两行Hello
    public void run() {
        while (!timeToQuit) {
            System.out.println("hello" + i++);
            try {
                if (i % 2 == 0) {
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void stopRuning() {
        timeToQuit = true;
    }
}