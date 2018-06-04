package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/6/5.
 * 将字符串str中的字符‘a’用‘$’替换，然后将字符串中第一个$字符前的所有字符去掉，并答应输出最后的str
 */
public class exam64 {
    public static void main(String[] args) {
        String str = "Iamagoodboy,andwhataboutyou?";
        str = str.replace('a', '$');
        int pos = str.indexOf('$');
        str = str.substring(pos);
        System.out.println(str);
    }

}
