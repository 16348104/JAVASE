package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/16.
 * 定义一个数组,然后将数组元素下标的值赋值给数组元素,最后按照数组元素下标的逆序输出数组
 */
public class exam18 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "]=" + arr[i] + " ");
        }
        System.out.println();
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.println("arr[" + i + "]=" + arr[i] + " ");
        }
    }

}
