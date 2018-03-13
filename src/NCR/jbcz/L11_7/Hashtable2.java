package NCR.jbcz.L11_7;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zb on 2018/3/13.
 */
public class Hashtable2 {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;
        balance.put("王向东", new Double(3434.34));
        balance.put("李闵", new Double(123.22));
        balance.put("赛书生", new Double(1378.00));
        //显示hash表中所有余额
        Set set = balance.keySet();             //获得关键字的集合视图
        Iterator itr = set.iterator();          //获得迭代
        while (itr.hasNext()) {
            str = (String) itr.next();
            System.out.println(str + ":" + balance.get(str));
        }
        //在李闵账户存入1000元
        bal = ((Double) balance.get("李闵")).doubleValue();
        balance.put("李闵", new Double(bal + 1000));
        System.out.println("李闵的新余额："+balance.get("李闵"));

    }
}