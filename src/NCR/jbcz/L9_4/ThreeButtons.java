package NCR.jbcz.L9_4;

import java.awt.*;

/**
 * Created by zb on 2018/3/14.
 */
public class ThreeButtons {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(new FlowLayout());
        Button button1 = new Button("ok");
        Button button2 = new Button("open");
        Button button3 = new Button("Close");
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.setVisible(true);
        f.setSize(300, 100);
    }
}