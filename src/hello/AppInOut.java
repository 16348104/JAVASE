package hello;

/**
 * Created by zb on 2017/8/18.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppInOut extends Applet {
    public static void main(String[] args) {
        Frame frame = new Frame();
        AppInOut app = new AppInOut();
        app.init();
        frame.add(app);
        frame.setSize(500, 100);
        frame.setVisible(true);
    }

    TextField in = new TextField(15);
    Button btn = new Button("求平方");
    Label out = new Label("用于显示结果");

    public void init() {
        setLayout(new FlowLayout());
        add(in);
        add(btn);
        add(out);
        btn.addActionListener(new BtnActionAdapter());
    }

    class BtnActionAdapter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = in.getText();
            double d = Double.parseDouble(s);
            double sq = d * d;
            out.setText(d + "的平方是：" + sq);
        }
    }
}