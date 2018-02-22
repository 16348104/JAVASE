package NCR.jbcz.L51;


/**
 * Created by xdx on 2018/2/21.
 */
public class TestCar {
    public static void main(String[] args) {
        Car x = new Car("红旗 AJ", false);
        Car y = new Car("QQ-WQ", true);
        System.out.println(x + "等同于" + y + "是：" + x.equals(y));
        System.out.println("x与y是同样的对吗？" + (x == y));
        Car z = y;
        System.out.println(y + "等同于" + z + "是：" + y.equals(z));
        System.out.println("y与x是同样的对吗？" + (y == z));
    }
}
