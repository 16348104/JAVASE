package NCR.jbcz.Base100;

/**
 * Created by zb on 2018/5/18.
 * 将字符数组arr中属于字母(A-Z和a-z)的字符添加到一个字符串str的尾部
 */
public class exam52 {
    public static void main(String[] args) {
        char arr[] = {'1', 'C', 'd', 'E', 'T', 's', '$', 'W', '#', '@', 'i'};
        String str;
        str = new String();
        int len = arr.length;
        int i = 0;
        do {
            if ((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z')) {
                str = str.concat(String.valueOf(arr[i]));
            }
            i++;
        } while (i < len);
        System.out.println(str);
    }
}