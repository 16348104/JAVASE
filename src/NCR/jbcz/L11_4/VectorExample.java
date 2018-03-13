package NCR.jbcz.L11_4;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by zb on 2018/3/13.
 */
public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector(2, 1);
        System.out.println("矢量初始大小" + v.size());
        System.out.println("矢量初始大小" + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("加4个整数元素后的容量" + v.capacity());
        v.addElement(new Double(5.45));
        System.out.println("当前容量：" + v.capacity());
        v.addElement(new Double(6.45));
        v.addElement(new Integer(5));
        System.out.println("当前容量：" + v.capacity());
        v.addElement(new Float(9.1));
        v.addElement(new Integer(6));
        System.out.println("当前容量：" + v.capacity());
        v.addElement(new Integer(7));
        v.addElement(new Integer(8));
        System.out.println("第一个元素"+(Integer)v.firstElement());
        System.out.println("最后一个元素"+(Integer)v.lastElement());
        if (v.contains(new Integer(3))) {
            System.out.println("矢量的容量:3");

        }
        Enumeration vEnum=v.elements();//枚举向量中的元素
        System.out.println("\n矢量中的元素：");
        while (vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement()+" ");
        }
    }

}