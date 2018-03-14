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
        f.add(p, "North");
        bfile = new Button("File");
        bhelp = new Button("Help");
        p.add(bfile, "North");
        p.add(bhelp, "West");
        p.add(ta, "Center");
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        TestNesting testNesting = new TestNesting();
        testNesting.creat();
    }

}