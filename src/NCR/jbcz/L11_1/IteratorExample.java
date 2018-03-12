package NCR.jbcz.L11_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by zb on 2018/3/12.
 * 迭代操作
 */
public class IteratorExample {
    public static void main(String[] args) {
        Collection intlist = new ArrayList();//创建列表数组
        int[] values = {9, 11, -4, 1, 14, 99, 1, 0};
        for (int i = 0; i < values.length; i++) {       //将当前整数值对象插入列表数组
            intlist.add(new Integer(values[i]));
        }
        System.out.println("迭代前：" + intlist);       //显示迭代前列表
        Iterator inter = intlist.iterator();            //定义迭代操作
        while (inter.hasNext()) {                       //循环实施迭代
            Integer element = (Integer) inter.next();   //取下一个对象
            int value = element.intValue();               //将对象转换成整数
            if (value < 1 || value > 10) {                    //删除1-10之间的元素
                inter.remove();
            }
        }
        System.out.println("迭代后：" + intlist);          //显示迭代之后列表
    }
}