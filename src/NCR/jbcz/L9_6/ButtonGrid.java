package NCR.jbcz.L9_6;

import java.awt.*;

/**
 * Created by zb on 2018/3/14.
 */
public class ButtonGrid {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLaout");
        frame.setLayout(new GridLayout(3, 2));//容器分为3行2列
        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}