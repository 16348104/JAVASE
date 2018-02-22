package NCR.jbcz.L52;

import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * Created by dell on 2018/2/22.
 * 根据Java类库目录结构的类名显示该类的修饰符和父类
 */
public class Test {
    public static void main(String[] args) {
        String name;
        System.out.println("根据类名获取类修饰符及其直接父类名:");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入含有包路径的类名");
        name = in.next();
        try {
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(name + " 的修饰符是" + modifiers + " ");
            }
            System.out.print(name);
            if (superc1 != null) {
                System.out.println(" 的直接父类是:" + superc1.getName());
            }
            System.out.print("\n\n");
        } catch (ClassNotFoundException e) {
            System.out.print("对不起,该类不在Java类库.\n\n");
        }
        System.exit(0);

    }
}
