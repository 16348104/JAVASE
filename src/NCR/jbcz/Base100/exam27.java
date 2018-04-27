package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/28.
 * 计算1-10之间(包括1和10)除5以外个自然数之和
 */
public class exam27 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while (i < 11) {
            if (i == 5) {
                i++;
                continue;
            }
            sum = sum + i;
            i++;
        }
        System.out.println("sum=" + sum);
    }
}
