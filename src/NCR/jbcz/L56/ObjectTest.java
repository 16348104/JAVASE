package NCR.jbcz.L56;

/**
 * Created by xdx on 2018/2/23.
 */
public class ObjectTest {
    public static void main(String[] args) {
        Employee zhang1 = new Employee("张浩", 75000,1987, 12, 15);
        Employee zhang2 = zhang1;//赋值操作用“==”
        Employee zhang3 = new Employee("张浩", 75000,1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
        System.out.println("zhang1==zhang2:" + (zhang1 == zhang2));
        System.out.println("zhang1==zhang3:"+(zhang1==zhang3));//非赋值操作
        System.out.println("zhang1.equals(zhang3):" + zhang1.equals(zhang3));//使用equals
        System.out.println("zhang1.equals(bob):" + zhang1.equals(bob));//使用equals
        System.out.println("bob.to string():" + bob);//覆盖object的to string()
        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Car1 Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("bonus.tostring():"+boss);
        System.out.println("car1.equals(boss):"+carl.equals(boss));//覆盖
        System.out.println("zhang1.hashcode():" + zhang1.hashCode());
        System.out.println("zhang3.hashcode():" + zhang3.hashCode());
        System.out.println("bob.hashcode():" + bob.hashCode());
        System.out.println("car1.hashcode():" + carl.hashCode());
        System.out.println("boss.hashcode():" + boss.hashCode());
    }
}
