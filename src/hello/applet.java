package hello;

/**
 * Created by zb on 2017/8/18.
 */
import java.awt.*;
import java.applet.*;
public class applet extends Applet { //an applet
    public void paint(Graphics g){
        g.drawString ("Hello World!",20,20);
    }
}