package NCR.jbcz.L9_14;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by dell on 2018/3/21.
 */
public class Anonymous {
    private Frame f;
    private TextField tf;

    public Anonymous() {
        f = new Frame("Inner classes example");
        tf = new TextField(30);
    }

    public void launchFrame() {
        Label label = new Label("Click and drag the mouse");
        f.add(label, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        f.addMouseMotionListener(new MouseAdapter() {    //匿名内部类开始
            @Override
            public void mouseDragged(MouseEvent e) {
                String s = "Mouse dragging:x=" + e.getX() + "Y+" + e.getY();
                tf.setText(s);
            }
        });
        f.addWindowListener(new WindowAdapter() {        //匿名内部类开始
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });                                                 //匿名内部类结束
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Anonymous obj = new Anonymous();
        obj.launchFrame();
    }
}
