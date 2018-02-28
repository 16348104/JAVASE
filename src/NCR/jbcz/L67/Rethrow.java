package NCR.jbcz.L67;

/**
 * Created by zb on 2018/2/28.
 */
public class Rethrow {
    public static void rt() throws Exception {//定义方法，抛出Exception累的异常
        System.out.println("old exception in rt()");
        throw new Exception("throw from rt()");
    }

    public static void wq() throws Throwable {  //定义方法，调用rt()捕获抛出异常
        try {
            rt();
        } catch (Exception e) {
            System.out.println("Inside wq(), e.printStackTrace():");
            e.printStackTrace();//输出堆栈使用情况
            throw e;            //重新抛出异常
        }
    }

    public static void main(String[] args) throws Throwable {
        try {
            wq();//产生被重新抛出的对象
        } catch (Exception e) {
            System.out.println("Caught in main,e.printStackTrace():");
            e.printStackTrace();//再次输出堆栈信息
        }

    }
}