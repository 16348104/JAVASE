package NCR.jbcz.Base100;


/**
 * Created by xdx on 2018/4/7.
 * 使用分支语句来控制输出,已知初始状态字符变量ch='A',整形变量r=6,并且输出结果r=5
 */
public class exam3 {
    public static void main(String[] args) {
        char ch = 'A';
        int r = 6;
        switch (ch + 1) {
            case 'A':
                r = r + 3;
            case 'B':
                r = r + 5;
            case 'C':
                r -= 6;
                break;
            default:
                r = r + 2;
        }
        System.out.println("r=" + r);

    }
}
