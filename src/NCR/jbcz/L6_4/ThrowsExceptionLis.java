package NCR.jbcz.L6_4;

/**
 * Created by zb on 2018/2/28.
 * 声明抛出异常
 */
public class ThrowsExceptionLis {
    static void Example(int keg) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("-----In keg Department" + keg + "----");
        if (keg == 10) {
            System.out.println("no Exception caught");
            return;
        } else if (keg == 20) {
            int iArray[] = new int[6];
            iArray[19] = 3;
        }

    }

    public static void main(String[] args) {
        try {
            Example(10);
            Example(20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch" + e);
        } finally {
            System.out.println("in Example finally");
        }
    }
}

