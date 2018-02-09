package NCR.jbcz.L310;
/*!的优先级最高，其次关系表达式，然后是&&，最后是||*/
public class OperatorsAndExpressions {
    void priorityOfRelationOperator() {
        int x = 10, y = 8;
        boolean b = true;
        System.out.println(x > 0 && x < y || b);
        System.out.println(x < y || !b);
        System.out.println(x == 10 && y != 8);
    }

    public static void main(String[] args) {
        OperatorsAndExpressions operatorsAndExp = new OperatorsAndExpressions();
        operatorsAndExp.priorityOfRelationOperator();


    }


}