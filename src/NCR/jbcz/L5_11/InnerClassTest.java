package NCR.jbcz.L5_11;

import javax.swing.*;


/**
 * Created by zb on 2018/2/27.
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "退出吗？");
        System.exit(0);
    }

}