package NCR.jbcz.L8_6;

/**
 * Created by dell on 2018/3/10.
 * 生产者如run()声明了生产值的行为
 */
public class Producer implements Runnable {
    private SyncStack theStack;
    private int num;
    private static int counter = 1;

    public Producer(SyncStack s) {
        this.theStack = s;
        num = counter++;
    }

    //run()方法是生产者线程的线程体,每次随机产生一个字母放入堆栈,并将得到的数据输出;然后休眠300毫秒,共进行200次
    public void run() {
        char c;
        for (int i = 0; i < 10; i++) {
            c = (char) (Math.random() * 26 + 'A');
            theStack.push(c);
            System.out.println("Producer" + num + ":" + c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
