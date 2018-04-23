package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/4/22.
 * 用冒泡法对数组元素arr[]={30,1,-9,70}进行排序
 */
public class exam23 {
    public static void main(String[] args) {
        int i, j;
        int arr[] = {30, 1, -9, 70};
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + "   ");
        }
    }
}
