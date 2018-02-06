package NCR.jbcz.L32;

/**
 * Created by dell on 2018/2/6.
 */
public class OperatorsAndExpressions {

    void doubleOperator() {
        System.out.println(9 / 2);//操作数都是int型，结果也是int型
        System.out.println(5 / 2.0); //因操作数为double型，结果也为double
        byte x = 3, y = 4;
        long r = 80L;
        System.out.println(r / y);//r为long类型，结果为long型
        System.out.println(x * y);//两个操作数都是byte型，结果是int型
        float z = 12.5f, w = 5.5f;
        System.out.println(z + w);//两个操作数都是float型，结果是float型
        System.out.println(z - x);//结果为9.5f
        int i = 10, j = 3;
        float m = 213.5f, n = 4.5f;//取模运算在整数和浮点数之间应用
        System.out.println(i % j);
        System.out.println(m % n);
    }

    public static void main(String[] args) {
        OperatorsAndExpressions operatorsAndExpressions = new OperatorsAndExpressions();
        operatorsAndExpressions.doubleOperator();
    }
}
