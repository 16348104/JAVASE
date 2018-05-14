package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/14.
 * 计算二维数组arr[][]=｛{34,21,45,67,20},{23,10,3,45,76},{22,3,79,56,50}｝中的最小值，并输出。
 */
public class exam48 {
    public static void main(String[] args) {
        int arr[][] = {{34, 21, 45, 67, 20}, {23, 10, 3, 45, 76}, {22, 3, 79, 56, 50}};
        int i = 0;
        int j = 0;
        int min = arr[0][0];
        while (i < 3) {
            while (j < 5) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println("The min:" + min);

    }
}
