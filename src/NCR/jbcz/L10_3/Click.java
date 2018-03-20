package NCR.jbcz.L10_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by zb on 2018/3/20.
 */
public class Click extends Applet implements MouseListener {
    int num = 0;

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);//在Applet中显示边框
        g.drawString("在鼠标上点击了" + num + "次", 5, 15);//显示鼠标点击次数


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        num++;
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}