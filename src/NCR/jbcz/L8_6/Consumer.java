package NCR.jbcz.L8_6;

/**
 * Created by dell on 2018/3/11.
 * 消费者run()消费者如run()声明了消费者的行为
 */
public class Consumer extends Thread {//消费者
    private SyncStack theStack;
    private int num;
    private static int counter = 1;

    public Consumer(SyncStack s) {
        this.theStack = s;
        num = counter++;
    }
    //run()方法是消费者线程的线程体,每次执行弹栈操作,并将得到的数据输出;然后休眠300毫秒,共进行200次
    public void run() {
        char c;
        for (int i = 0; i < 10; i++) {
            c = theStack.pop();
            System.out.println("consumer" + num + ":" + c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
