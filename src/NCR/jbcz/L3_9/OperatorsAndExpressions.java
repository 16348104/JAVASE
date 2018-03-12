package NCR.jbcz.L3_9;

public class OperatorsAndExpressions {
    void shortCircuit2(int val) {
        if ((val != 0) && (1 / val < Double.MAX_VALUE)) {
            System.out.println("val的倒数为：" + 1 / val);
        } else {
            System.out.println("val的倒数是无穷大");
        }
    }

    public static void main(String[] args) {
        OperatorsAndExpressions operatorsAndExp = new OperatorsAndExpressions();
        operatorsAndExp.shortCircuit2(0);
    }
}