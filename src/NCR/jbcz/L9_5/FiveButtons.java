package NCR.jbcz.L9_5;

import java.awt.*;

/**
 * Created by zb on 2018/3/14.
 */
public class FiveButtons {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayout");
        f.setLayout(new BorderLayout());
        f.setSize(300, 300);
        f.setVisible(true);
        f.add("North",new Button("North"));
        f.add("South",new Button("South"));
        f.add("East",new Button("East"));
        f.add("West",new Button("West"));
        f.add("Center",new Button("Center"));

    }
}