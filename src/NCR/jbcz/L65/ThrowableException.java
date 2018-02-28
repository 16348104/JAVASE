package NCR.jbcz.L65;

/**
 * Created by zb on 2018/2/28.
 * 自定义异常
 */
public class ThrowableException {
    public static void main(String[] args) {
        try {
            throw new Throwable("Here is my Exception.");
        } catch (Throwable throwable) {
            System.out.println("Caught Throwable");
            System.out.println("e.getMessage:"+ throwable.getMessage());
            System.out.println("e.toString"+ throwable.toString());
            System.out.println("e.printStackTrace():");
            throwable.printStackTrace();
        }

    }
}