package NCR.jbcz.L4_1;


/**
 * Created by xdx on 2018/2/12.
 */
public class IFStatement {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        System.out.println("The score is:" + x);
        if (x >= 60) {
            System.out.println("Pass the examination！");
            System.out.println("Congratulatioins!");
            System.out.println("Have a good day!");
        }
        System.out.println("Bye Bye!");
    }

}
