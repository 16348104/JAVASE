package NCR.jbcz.Base100;

/**
 * Created by zb on 2018/5/18.
 * 将字符数组arr[]=｛‘a’,'C','d','E','T','s','$','W','z'｝中的所有小写字母变成大写，并打印输出字符数组
 */
public class exam51 {
    public static void main(String[] args) {
        char arr[] = {'a', 'C', 'd', 'E', 'T', 's', '$', 'W', 'z'};
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 32);
                i++;
            }
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}