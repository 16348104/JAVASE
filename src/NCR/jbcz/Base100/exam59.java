package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/26.
 * 分别输出字符串a\b、"c\d"和'e/f'
 */
public class exam59 {
    public static void main(String[] args) {
        String str = new String();
        str="a\\b";
        System.out.println(str);
        str="\"c\\d\"";
        System.out.println(str);
        str="\'e/f\'";
        System.out.println(str);

    }
}
