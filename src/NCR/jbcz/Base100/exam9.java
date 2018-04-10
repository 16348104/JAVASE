package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/4/9.
 * 定义一个长度为20的整数数组并赋值，且数组中的数值是递增的，程序将数组中元素做头尾置换，最后从第一个元素开始打印输出。
 * 第一个元素和倒数第一个交换，以此类推
 */
public class exam9 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int i = 0;
        for (i = 0; i < 20; i++) {
            arr[i] = (i + 1) * 5;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("==============================================================");
        int temp;
        i = 0;
        int j = 19;
        while (i <10) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (i = 0; i < 19; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
