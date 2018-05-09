package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/8.
 * 定义一个带有参数的构造方法，并定义一个该类的对象temp，构造方法有两个参数：字符串name和整形age，
 * 定义对象temp时将字符串“Tom”和整数17传递给构造方法，构造方法将两个参数打印输出（如Tom is 17 years old.）
 */
public class exam40 {
    String name;
    int age;

    public static void main(String[] args) {
        String name = "Tom";
        int age = 17;
        exam40 temp = new exam40(name, age);
    }

    public exam40(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " is " + age + " years old.");
    }
}
