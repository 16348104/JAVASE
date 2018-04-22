package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/4/22.
 * 定义类中带有参数的构造方法和普通方法，并定义类的对象temp，程序中将字符串“Jim”和
 * 整数19在定义对象时作为构造方法的参数传递给类，然后调用方法printInfo打印传递的变量（如Jim已经有19岁了）
 */
public class exam19 {
    String name;
    int age;

    public exam19(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        String name = "Jim";
        int age = 20;
        exam19 temp = new exam19(name, age);
        temp.printInfo();


    }
    private void printInfo() {
        System.out.println(name + "已经有" + age + "岁了。");
    }
}
