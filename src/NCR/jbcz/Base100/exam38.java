package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/8
 * 判断一个字符串“Tom”是否在另一个字符串“I am Tom ,I am from China.”中出现
 */
public class exam38 {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "I am Tom ,I am from China.";
        str2 = "Tom";
        int i = str1.indexOf(str2);
        if (i != -1) {
            System.out.println("\" " + str2 + "\"is in the string:\"" + str1 + "\"");
        } else {
            System.out.println("\" " + str2 + "\"is not in the string:\"" + str1 + "\"");
        }
    }
}
