package NCR.jbcz.L34;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * Created by dell on 2018/2/6.
 */
public class OperatorExpression {
    void stringPlus(){
        int x=3,y=4,z=5;
        String s = "xyz=";
        System.out.println(x+y+z);
        System.out.println(s+x+y+z);
        System.out.println(x + y + z + s);
        System.out.println("abc" + 3);
        System.out.println(3.0 + "abc");
    }

    public static void main(String[] args) {
        OperatorExpression operatorExpression = new OperatorExpression();
        operatorExpression.stringPlus();

    }
}
