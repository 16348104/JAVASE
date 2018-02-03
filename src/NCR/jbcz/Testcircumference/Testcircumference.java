package NCR.jbcz.Testcircumference;

//import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by zb on 2018/1/31.
 */
public class Testcircumference {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.raduis = 20;
        double circum = c.circumference();
        System.out.println("周长是:" + circum);
    }
}
