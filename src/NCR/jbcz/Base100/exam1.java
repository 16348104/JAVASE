package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/6.
 * 定义一个长度为20的整数数组,将1-20分别赋值给数组元素,计算该数组所有元素之和
 */
public class exam1 {
    public static void main(String[] args) {
        int sum;
        sum = 0;
        int arraylist[] = new int[20];
        for (int i = 0; i < arraylist.length; i++) {
            arraylist[i] = i + 1;
        }
        int pos = 0;
        while (pos < 20) {
            if (pos < 20) {
                sum = sum + arraylist[pos];
                pos++;
            }
        }
        System.out.println("sum=" + sum);
    }
}
