package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/26.
 * 利用递归的方法求前N个自然数的和（n=10）
 */
public class exam61 {
    public static void main(String[] args) {
        int sum = add(10);
        System.out.println("1+2+3+......+10=" + sum);
    }

    public static int add(int n) {
        if (n == 1) {
            return 1;
        } else {
            return add(n - 1) + n;
        }

    }

}
