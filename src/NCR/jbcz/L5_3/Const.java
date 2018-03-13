package NCR.jbcz.L5_3;

/**
 * Created by xdx on 2018/2/23.
 */
public class Const {
    public static void main(String[] args) {
        char chars1[] = {'t', 'e', 's', 't'};
        char chars2[] = {'t', 'e', 's', 't', 'l'};
        String s1 = new String(chars1);
        String s2 = new String(chars2, 0, 4);
        System.out.println("Value of String s1 is:" + s1);
        System.out.println("Value of String s2 is:" + s2);
        System.out.println("它们都是字符串test！");
    }
}
