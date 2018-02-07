package NCR.jbcz.L37;

/**
 * Created by dell on 2018/2/8.
 * equals()方法比较两个操作数的内容是否一样，但对于自己定义的类，其equals方法的操作是与“==”运算一样的
 */
public class Operators {
    void equalsMethod2() {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        class MyValue {//内部类
            int i;
        }
        MyValue v1 = new MyValue();
        MyValue v2 = new MyValue();
        v1.i = v2.i=2;
        System.out.println(v1.equals(v2));

    }

    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.equalsMethod2();

    }


}
