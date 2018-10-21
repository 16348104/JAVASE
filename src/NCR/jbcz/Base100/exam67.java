package NCR.jbcz.Base100;

/**
 * Created by zb on 2018/7/16.
 * 比较两个实型对象的大小，并输出结果。
 * 其中对象d1,d2的值都是7.2 打印结果为Equal!
 */
public class exam67 {
    public static void main(String[] args) {
        Double d1 = new Double(7.2);
        Double d2 = new Double("7.2");
        if (d1.equals(d2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }

    }
}