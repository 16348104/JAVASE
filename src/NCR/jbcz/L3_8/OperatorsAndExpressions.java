package NCR.jbcz.L3_8;

public class OperatorsAndExpressions {
    void shortCircuitl(int val) {
        if (test1(val) && test2(val) && test3(val)) {
            System.out.println("短路逻辑表达式结果为真");
        } else {
            System.out.println("短路逻辑表达式结果为假");
        }
    }

    boolean test1(int val) {
        System.out.println("第一个布尔表达式结果：" + (val < 6));
        return val < 6;
    }

    boolean test2(int val) {

        System.out.println("第二个布尔表达式结果：" + (val < 4));
        return val < 4;
    }

    boolean test3(int val) {

        System.out.println("第三个布尔表达式结果：" + (val < 2));
        return val < 2;

    }

    public static void main(String[] args) {
        OperatorsAndExpressions operators = new OperatorsAndExpressions();
        operators.shortCircuitl(5);

    }

}