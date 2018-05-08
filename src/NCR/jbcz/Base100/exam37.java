package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/5/8.
 * 统计字母m在字符串“I am Tom,I am from China.”中出现次数
 */
public class exam37 {
    public static void main(String[] args) {
        String str = "I am Tom,I am from China.";
        char c = 'm';
        int i;
        int sum = 0;
        for (i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (c == temp) {
                sum++;
            }
        }
        System.out.println(str + "中" + c + "出现了" + sum + "次");
    }
}
