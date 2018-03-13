package NCR.jbcz.L11_6;

import java.util.*;

/**
 * Created by zb on 2018/3/13.
 */
public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;
        balance.put("王向东", new Double(3434.34));
        balance.put("李闵", new Double(123.22));
        balance.put("赛书生", new Double(1378.00));
        names = balance.keys();//显示hash表中所有余额
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ":" + balance.get(str));
        }
        //在李闵账户存入1000元
        bal = ((Double) balance.get("李闵")).doubleValue();
        balance.put("李闵", new Double(bal + 1000));
        //System.out.println("李闵的新余额："+balance.get("李闵"));
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ":" + balance.get(str));
        }
    }
}