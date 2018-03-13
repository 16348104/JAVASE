package NCR.jbcz.L5_8;


/**
 * Created by zb on 2018/2/25.
 */
public class Light {
    int wattage;//瓦特数
    boolean indicator;
    String location;
    static int counter;//static变量

    public Light() {
        wattage = 50;
        indicator = true;
        location = "X";
        counter++;
    }
    //static方法
    public static void writeCount(){
        System.out.println("Number of lights:" + counter);
    }
}