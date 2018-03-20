package NCR.jbcz.L9_12;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by dell on 2018/3/21.
 */
public class TestInnerClass {
    private Frame f;
    private TextField tf;

    public void launchFrame() {
        f = new Frame("Inner classes example");
        tf = new TextField(30);
        Label label = new Label("Click and drag the mouse");
        f.add(label, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        f.addMouseListener(new MyMouseMotionLister());//参数为内部类对象
        f.addWindowListener(new MyWindowListener());//参数为内部类对象
        f.setSize(300, 200);
        f.setVisible(true);
    }


    class MyMouseMotionLister extends MouseMotionAdapter {   //内部类开始
        public void mouseDragged(MouseEvent e) {
            String s = "Mouse dragged: x=" + e.getX() + "y=" + e.getY();
            tf.setText(s);
        }
    }                                                       //内部类结束

    class MyWindowListener extends WindowAdapter {  //内部类开始
        public void windowClosing(WindowEvent e) {
            System.exit(1);
        }
    }                                                //内部类结束

    public static void main(String[] args) {
        TestInnerClass tic = new TestInnerClass();
        tic.launchFrame();
    }
}
