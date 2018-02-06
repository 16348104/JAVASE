package NCR.jbcz.L31;

/**
 * Created by zb on 2018/2/5.
 */
public class OperatorsAndExpressions {

    void singleArithmaticOprator() {
        float i = 2.0f, j = 10.0f;
        int m = 20, n = 10;
        System.out.println((++i) * (j--));
        System.out.println("i=" + i + ",j=" + j);
        System.out.println((i++) * (j--));
        System.out.println("i=" + i + ",j=" + j);
        System.out.println((--m) * (n++));

        System.out.println("m=" + m + ",n=" + n);
        System.out.println((m--) * (n++));
        System.out.println("m=" + m + ",n=" + n);
    }

    public static void main(String[] args) {
        OperatorsAndExpressions operatorsAndExp = new OperatorsAndExpressions();
        operatorsAndExp.singleArithmaticOprator();
    }

}
