package NCR.jbcz.Base100;
/**
 * Created by xdx on 2018/4/
 * 读入运行程序时所传入的参数（一个或多个），并将参数依次显示出来，例如运行程序Java exam5 par1 par2,
 * 则输出par1 par2
 */
public class exam5 {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
            System.out.println(args[i] + " ");
            i++;
        }
        System.out.println();
    }
}
