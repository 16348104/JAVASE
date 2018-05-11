package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/11.
 * 比较两个字符串"Welcome to China!"和"Welcome you back home!"的大小
 * 即对应字符相比,出现第一个不相等的字符时,大的所在的字符串大,小的所在的字符串小,字符串的比较相当于对应的ASCII的比较.
 */

public class exam43 {
    public static void main(String[] args) {
        String str1 = "Welcome to China!";
        String str2 = "Welcome you back home!";
        int l = str1.length() < str2.length() ? str1.length() : str2.length();
        char c1 = ' ', c2 = ' ';
        for (int i = 0; i < l; i++) {
            c1 = str1.charAt(i);
            c2 = str2.charAt(i);
            if (c1 != c2) {
                break;
            }
        }
        if (c1 > c2) {
            System.out.println("\"" + str1 + "\"" + ">" + "\"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\"" + "<" + "\"" + str2 + "\"");
        }
    }

}
