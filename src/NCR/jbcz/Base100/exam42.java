package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/9.
 * 将字符串"Welcome to China!"中的所有字符存储到一个字符数组中,并打印输出
 */
public class exam42 {
    public static void main(String[] args) {
        String string = "Welcome to China!";
        int n = string.length();
        char[] arr;
        arr = new char[n];
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            arr[i] = c;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

}
