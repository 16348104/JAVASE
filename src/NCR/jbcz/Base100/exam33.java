package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/5/7.
 * 提取“China is a great country.”中的前5个字符生成一个新的字符串，并将剩余字符组成另外一个新的字符串，
 * 最后将两个新的字符串连接输出
 */
public class exam33 {
    public static void main(String[] args) {
        String str = "China is a great country.";
        String headstr = null;
        String trailstr = null;
        headstr = str.substring(0, 5);
//        trailstr = str.substring(5,str.length()-1);
        trailstr = str.substring(5);
        System.out.println(headstr + trailstr);
    }

}
