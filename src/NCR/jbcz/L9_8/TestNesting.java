package NCR.jbcz.L9_8;


import java.awt.*;


/**
 * Created by zb on 2018/3/14.
 */
public class TestNesting {
    private Frame f;
    private Panel p;
    private Button bw, bc;
    private Button bfile, bhelp;
    private TextArea ta;

    public void creat() {
        f = new Frame("容器嵌套");
        ta = new TextArea("text area");
        bw = new Button("West");
        bc = new Button("work space region");
        f.add(bw, "West");
        f.add(bc, "Center");
        p = new Panel();
        p.setLayout(new BorderLayout());
        f.add(p, "North");//面板P作为一个组件添加到窗体
        bfile = new Button("File");
        bhelp = new Button("Help");
        p.add(bfile, "North");//按钮bfile被添加到面板P
        p.add(bhelp, "West");//按钮bhelp被添加到面板P
        p.add(ta, "Center");//文本域ta被添加到面板P
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        TestNesting testNesting = new TestNesting();
        testNesting.creat();
    }

}