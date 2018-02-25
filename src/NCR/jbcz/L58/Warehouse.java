package NCR.jbcz.L58;

/**
 * Created by zb on 2018/2/25.
 */
public class Warehouse {
    public static void main(String[] args) {
        Light.writeCount();//用类名调用
        Light alight = new Light();//创建对象
        System.out.println("Value of counter:" + Light.counter);//通过类名访问
        Light blight = new Light();
        blight.writeCount();//引用访问
        Light clight = new Light();
        System.out.println("Value of counter:"+clight.counter);//引用访问
    }
}