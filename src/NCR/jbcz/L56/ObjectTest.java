package NCR.jbcz.L56;

/**
 * Created by xdx on 2018/2/23.
 */
public class ObjectTest {
    public static void main(String[] args) {
        Employee zhang1 = new Employee("张浩", 75000.1987, 12, 15);
        Employee zhang2 = zhang1;//赋值操作用“==”
        Employee zhang3 = new Employee("张浩", 75000.1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
        System.out.println("zhang1==zhang2:" + (zhang1 == zhang2));
        System.out.println("zhang1==zhang3:"+(zhang1==zhang3));//非赋值操作
        System.out.println("zhang1.equals(zhang3):" + zhang1.equals(zhang3));//使用equals
        System.out.println("zhang1.equals(bob):" + zhang1.equals(bob));//使用equals
        System.out.println("bob.to string():" + bob);//覆盖object的to string()

    }
}
