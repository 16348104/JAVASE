package NCR.jbcz.Base100;
/**
 * Created by dell on 2018/5/17.
 * 计算半径为2.4的圆的面积
 */
public class exam50 {
    public static void main(String[] args) {
        double r=2.4;
        double area = area(r);
        System.out.println("area=" + area);
    }

    private static double area(double r) {
        double area;
        area = StrictMath.PI * r * r / 2;
        return area;
    }
}
