package NCR.jbcz.L8_4;

/**
 * Created by zb on 2018/3/9.
 */
public class ThreadTerminate {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Hello hello = new Hello();//主线程
        Thread thread = new Thread(hello);//thread线程
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        System.out.println("Please stop saying Hello and say good morning!");
        hello.stopRuning();//设置线程T的终止标志
        while (i < 5) {
            System.out.println("Good Morning" + i++);
        }
    }
}