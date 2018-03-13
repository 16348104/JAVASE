package NCR.jbcz.L6_8;

/**
 * Created by zb on 2018/2/28.
 */
public class Switch {
    boolean state = false;
    boolean read(){
        return state;

    }
    void on(){
        state = true;
    }
    void off(){
        state = false;
    }
}