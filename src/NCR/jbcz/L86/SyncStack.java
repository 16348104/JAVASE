package NCR.jbcz.L86;

import java.util.Vector;

/**
 * Created by dell on 2018/3/10.
 * 声明了Synchronized,实现堆栈
 */
public class SyncStack {
    private Vector buffer = new Vector(400, 10);
    //为了保证数据的一致性,POP()方法声明了synchronized

    public synchronized char pop() {
        char c;
        while (buffer.size() == 0) { //如果在栈中为空,则执行的方法必须等待,直到栈中有数据
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        c = ((Character) buffer.remove(buffer.size() - 1)).charValue();//弹栈操作
        return c;
    }

    public synchronized void push(char c) {
        this.notify();//通知等待的线程
        Character character = new Character(c);
        buffer.addElement(character);
    }
}

