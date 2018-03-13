package NCR.jbcz.L9_1;

import java.awt.*;
public class FirstFrame extends Frame {
    public static void main(String[] args) {
        FirstFrame firstFrame = new FirstFrame("first container!");//构造方法
        firstFrame.setSize(240, 240);//设置frame大小，默认（0，0）
        firstFrame.setBackground(Color.yellow);//设置背景，默认白色
        firstFrame.setVisible(true);//设置可见
    }

    public FirstFrame(String str) {
        super(str);//调用父类的构造方法
    }
}
