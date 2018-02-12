package NCR.jbcz.L312;

/**
 * Created by xdx on 2018/2/12.
 */
public class OperatorsAndExpressions {
    String conditionalExpression(int scorce) {
        String result;
        result = (scorce >= 60) ? "passed" : "doesn't pass";
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        OperatorsAndExpressions operatorsAndExpressions = new OperatorsAndExpressions();
        operatorsAndExpressions.conditionalExpression(60);
    }
}
