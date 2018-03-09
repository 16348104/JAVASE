package NCR.jbcz.L83;

/**
 * Created by zb on 2018/3/9.
 */
public class ThreadJoinTest {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Hello t = new Hello();
        t.start();
        while (true) {
            System.out.println("Good Morning for Hello!" + i++);
            if (i == 2 && t.isAlive()) {
                System.out.println("Main waiting for Hello!");
                t.join();
            }
            if (i == 5) {
                break;
            }
        }
    }
}