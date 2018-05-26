package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/26.
 * 将数组中arr[]={5,6,3,7,9,1}的各个元素按下标逆序输出
 */
public class exam60 {
    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 7, 9, 1};
        int n;
        n = arr.length-1;
        while (n >= 0) {
            System.out.print(arr[n] + " ");
            n--;
        }
    }
}
