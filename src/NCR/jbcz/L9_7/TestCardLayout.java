package NCR.jbcz.L9_7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;                      //事件处理机制

/**
 * Created by zb on 2018/3/14.
 */
public class TestCardLayout implements ActionListener {
    private Panel p1,p2,p3;
    private Button b1,b2, b3;
    private Frame frame;
    private CardLayout cardLayout = new CardLayout();        //定义cardlayout布局管理器

    public void create() {
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        frame=new Frame("Test CardLayout");
        p1.add(b1);
        b1.addActionListener(this);    //为按钮注册监听器
        p2.add(b2);
        b2.addActionListener(this);
        p3.add(b3);
        b3.addActionListener(this);
        frame.setLayout(cardLayout);
        frame.add(p1, "第一层");
        frame.add(p2, "第二层");
        frame.add(p3, "第三层");
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TestCardLayout tc = new TestCardLayout();
        tc.create();

    }

    public void actionPerformed(ActionEvent event) {
        cardLayout.next(frame);          //点击按钮时，现实下一张卡片

    }
}