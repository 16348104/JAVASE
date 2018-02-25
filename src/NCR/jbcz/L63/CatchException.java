package NCR.jbcz.L63;


/**
 * Created by zb on 2018/2/25.
 */
public class CatchException {
    static void Example(int keg) {
        System.out.println("---In Keg Department" + keg + "----");

        try {
            if (keg == 10) {
                System.out.println("no Exception caught");
                return;
            } else if (keg == 20) {
                int i = 0;
                int j = 8 / i;

            } else if (keg == 30) {
                int iArray[] = new int[4];
                iArray[10] = 3;
            }
        } catch (ArithmeticException e) {
            System.out.println("Catch" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch" + e.getMessage());//e.getMessage 调用异常对象e的方法，输出相关信息
        } catch (Exception e) {
            System.out.println("Will not be exception");
        } finally {
            System.out.println("in Example finally");
        }
    }

    public static void main(String[] args) {
        Example(10);
        Example(20);
        Example(30);
    }
}