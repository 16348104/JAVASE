package NCR.jbcz.L86;

import java.util.Vector;

/**
 * Created by dell on 2018/3/10.
 */
public class SyncStack {
    private Vector buffer = new Vector(400, 10);

    public synchronized char pop() {
        char c;
        while (buffer.size() == 0) {
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
        this.notify();
        Character character = new Character(c);
        buffer.addElement(character);
    }
}

