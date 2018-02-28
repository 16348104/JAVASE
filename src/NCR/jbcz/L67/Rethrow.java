package NCR.jbcz.L67;

/**
 * Created by zb on 2018/2/28.
 */
public class Rethrow {
    public static void rt() throws Exception{
        System.out.println("old exception in rt()");
        throw new Exception("throw from rt()");
    }
    public static void wq() throws Throwable{
        try{
            rt();
        }catch (Exception e){
            System.out.println("Inside wq()");
        }
    }
}