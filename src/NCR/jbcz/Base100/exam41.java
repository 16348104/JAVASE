package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/9.
 * 读取命令行中参数的个数，并依次输出打印，如果没有输出参数，则打印输出“No para”
 *
 */
public class exam41 {
    public static void main(String[] args) {
        int num;
        num=args.length;
        if (num==0) {
            System.out.println("No para");
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Para" + i + ":" + args[i]);
        }
    }
}
