package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/11.
 * 定义一个长度为5的一维数组,然后将0-4分别赋给数组中的元素,最后按数组的下标逆序打印输出
 */
public class exma44 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            arr[i] = i;
        }
        for (i = 4; i >= 0; i--) {
            System.out.print("arr[" + i + "]=" + arr[i] + "  ");
        }
    }
}
