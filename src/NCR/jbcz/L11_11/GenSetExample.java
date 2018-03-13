package NCR.jbcz.L11_11;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zb on 2018/3/13.
 * set泛型实例
 */
public class GenSetExample {
    public static void main(String[] args) {//Set<String>类的变量set赋予新的HashSet<String>对象
        Set<String> set = new HashSet<String>();
        //添加对象
        set.add("one");
        set.add("two");
        set.add("3nd");
        System.out.println(set);
    }
}