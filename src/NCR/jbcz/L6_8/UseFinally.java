package NCR.jbcz.L6_8;


/**
 * Created by zb on 2018/2/28.
 */
public class UseFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (IllegalAccessError e) {
            System.out.println("IOException");
        } finally {
            sw.off();
        }
    }
}