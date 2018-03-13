package NCR.jbcz.L11_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zb on 2018/3/13.
 */
public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("欢迎您");
        list.add("学习");
        list.add("java");
        list.add(new Integer(2008));
        list.add("谢谢！");
        System.out.println(list);
    }
}