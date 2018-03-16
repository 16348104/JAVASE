package NCR.jbcz.L9_9;

import NCR.jbcz.L5_2.Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by zb on 2018/3/16.
 */
public class TestAddListener implements ActionListener,WindowListener {
    Frame f;
    Button b;
    public void create() {
        f = new Frame("Add listens");
        b = new Button("press me");
        b.addActionListener(this);
        f.addWindowListener(this);
        f.add(b, "north");
        f.setSize(200, 200);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        TestAddListener testAddListener = new TestAddListener();
        testAddListener.create();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(1);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("the Button is pressed.");

    }
}