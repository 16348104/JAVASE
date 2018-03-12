package NCR.jbcz.TEST;

/**
 * Created by zb on 2018/3/12.
 */
public class TestThread extends Thread{
    private String sTname = "";

    public TestThread(String s) {
        this.sTname = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sTname+"");
        }
    }
}