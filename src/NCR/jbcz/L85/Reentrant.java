package NCR.jbcz.L85;

/**
 * Created by zb on 2018/3/9.
 * synchronized临界区
 */
public class Reentrant {
    public synchronized void a(){
        b();
        System.out.println("here I am,in a()");
    }
    public synchronized void b(){
        System.out.println("here I am.in b()");

    }

    public static void main(String[] args) {
        Reentrant r=new Reentrant();
        r.a();
    }
}