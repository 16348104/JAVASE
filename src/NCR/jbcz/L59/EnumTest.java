package NCR.jbcz.L59;

import java.util.Scanner;

/**
 * Created by zb on 2018/2/25.
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入服装型号：（SMALL，MEDIUM，LARGE，EXTRA_LARGE,EXTRA_EXTRA_LARGE）");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getabbreviation());
        if (size == Size.EXTRA_LARGE ^ size == Size.EXTRA_EXTRA_LARGE) {
            System.out.println("你注意到了下划线“_”。");
        }
    }
}
