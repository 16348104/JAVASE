package NCR.jbcz.L66;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by zb on 2018/2/28.
 */
public class ExceptionCatch {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("text");
            System.out.println("content of text is:");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("message:" + e.getMessage());
            e.printStackTrace(System.out);
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}