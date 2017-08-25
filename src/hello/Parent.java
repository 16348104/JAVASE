package hello;

/**
 * Created by zb on 2017/8/25.
 */
public class Parent {
    {
        System.out.println("parent constructor block.");
    }
        static  {
        System.out.println("parent static block.");
    }
    public Parent(){
        System.out.println("parent constructor.");
    }
}
class Child extends Parent{
    {
        System.out.println("child constructor block.");
    }
    static {
        System.out.println("child static block.");
    }
    public Child(){
        System.out.println("child block.");
    }
}
class Test{
    public static void main(String[] args) {
        new Child();
    }
}
