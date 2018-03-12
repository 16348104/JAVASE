package NCR.jbcz.L3_3;

/**
 * Created by dell on 2018/2/7.
 */
public class OperatorsAndExpressions {
    void residual() {
        int i = 10, j = 3;  //取模运算在整数和浮点数之间应用
        float m = 213.5f, n = 4.0f;
        System.out.println(i % j);
        System.out.println(m % n);
    }

    public static void main(String[] args) {
        OperatorsAndExpressions operatorsAndExpressions = new OperatorsAndExpressions();
        operatorsAndExpressions.residual();
    }

}
