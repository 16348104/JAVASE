package hello;
import java.util.Scanner;
/**
 * Created by xyzhang on 16/9/17.
 */
public class CaiShu {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100 + 1);
        int a = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("我已经想好了一个1到100之间的数!");
        System.out.println("请你猜猜这个数:");
        do {

            a = in.nextInt();
            count++;
            if (a < num) {
                System.out.println("你猜的数偏小");
            } else {
                System.out.println("你猜的数偏大");
            }
        } while (a != num);
        System.out.println("太好了,经过" + count + "你次终于猜对了");


    }


}
