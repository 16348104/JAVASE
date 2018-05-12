package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/12.
 * 求一个一维数组arr[]={13,7,21,7,9,69,34,85}中的最大值.
 */
public class exam45 {
    public static void main(String[] args) {
        int arr[] = {13, 7, 21, 7, 9, 69, 34, 85};
        int l = arr.length;
        int temp;
        temp=arr[0];
        for (int i = 1; i < l; i++) {
            if (arr[i]>temp) {
                temp=arr[i];
            }
        }
        System.out.println("The max:" + temp);

    }
}
