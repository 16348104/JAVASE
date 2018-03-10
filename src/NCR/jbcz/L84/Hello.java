package NCR.jbcz.L84;

/**
 * Created by zb on 2018/3/9.
 */
public class Hello implements Runnable {
    int i = 0;
    private boolean timeToQuit = false;


    @Override
    //每隔5000ms输出两行Hello
    public void run() {
        while (!timeToQuit) {
            System.out.println("Hello" + i++);
            try {
                if (i % 2 == 0) {
                    Thread.sleep(5000);
                }
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }

    }

    public void stopRuning() {
        timeToQuit = true;
    }
}