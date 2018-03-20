package NCR.jbcz.TEST;
import javax.swing.*;
import java.awt.*;

/**
 * Created by zb on 2018/3/20.
 */
public class Test4 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        f.setLayout(new BorderLayout());
        f.getContentPane().add(p, "center");
        p.setBackground(Color.BLUE);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}