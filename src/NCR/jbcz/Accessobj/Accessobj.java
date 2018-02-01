package NCR.jbcz.Accessobj;

/**
 * Created by zb on 2018/2/1.
 */
public class Accessobj {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        point.move(5, 5);
        System.out.println("x="+point.x+",y="+point.y);
    }
}
