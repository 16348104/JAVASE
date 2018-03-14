package NCR.jbcz.L9_3;

import java.awt.*;

/**
 * Created by zb on 2018/3/14.
 */
public class TwoButton {
    private Frame f;
    private Button b1;
    private Button b2;

    public static void main(String[] args) {
        TwoButton two = new TwoButton();
        two.go();

    }

    private void go() {
        f = new Frame("FlowLayout");
        f.setLayout(new FlowLayout());     //设置布局管理器
        b1 = new Button("Press Me");
        b2 = new Button("Don't Pres Me");
        f.add(b1);
        f.add(b2);
        f.pack();            //紧凑排列
        f.setVisible(true);
    }
}