package NCR.jbcz.L511;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zb on 2018/2/27.
 */
public class TalkingClock {
    public void start(int interval, final boolean beep) {
        ActionListener listener = new ActionListener() {//创建匿名内部类对象
            @Override
            public void actionPerformed(ActionEvent e) {//实现监听器接口
                java.util.Date now = new java.util.Date();
                System.out.println("蜂鸣器发声的时间是：" + now);
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();

                }
            }
        };
        Timer timer = new Timer(interval, listener);// 匿名内部类对象作Timer参数
        timer.start();
    }
}