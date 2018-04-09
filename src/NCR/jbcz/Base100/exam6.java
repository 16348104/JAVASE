package NCR.jbcz.Base100;
/**
 * Created by xdx on 2018/4/9.
 * 把一个字符串传入程序，并与程序中的字符串比较，如果相等则输出“Equal”否则输出 “nequal”
 * 如运行Java exam6 Welcome,则输出Equal
 */
public class exam6 {
    public static void main(String[] args) {
        String str = new String("Welcome");
        String temp = null;
        if (args.length > 0) {
            temp = args[0];
        }
        if (str.equals(temp)) {
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
            System.out.println();
        }
    }
}
