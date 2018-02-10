package NCR.jbcz.parampass;

/**
 * Created by dell on 2017/9/18.
 */
public class ParamPass {
     static class Object1 {
        public String QQ = "小猫";
    }

    static void paramChange(int x, Object1 obj1) {
        x = 18;
        obj1.QQ = "小狗";
    }

    public static void main(String args[]) {
        int x = 28;
        Object1 obj1 = new Object1(); //创建对象obj
        System.out.println("传值前的参数值：x=" + x + " QQ=" + obj1.QQ);
        ParamPass.paramChange(x, obj1);                 /* 传递变量和对象引用 */
        System.out.println("传值后的参数值：x=" + x + " QQ=" + obj1.QQ);

    }
}
