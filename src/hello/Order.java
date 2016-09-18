package hello;

import java.util.Scanner;

/**
 * Created by zb on 2016/9/18.
 * 正序分解整数
 */
public class Order {
    public static void main(String[] args) {
        System.out.println("请输入一串正整数：");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        do {
            System.out.println(x%10);
            x = x / 10;
        } while (x>0);
    }
}
