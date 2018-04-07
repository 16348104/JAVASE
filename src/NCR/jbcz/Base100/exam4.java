package NCR.jbcz.Base100;

/**
 * Created by xdx on 2018/4/7.
 * 计算出三个数中(1234,456,-987)最大的并输出结果
 */
public class exam4 {
    public static void main(String[] args) {
        int i1 = 1234, i2 = 456, i3 = -987;
        int MaxValue;
        MaxValue = max(i1, i2, i3);
        System.out.println("三个数中最大值是:" + MaxValue);
    }

    private static int max(int x, int y, int z) {
        int temp, max_value;
        temp = x > y ? x : y;
        max_value = temp > z ? temp : z;
        return max_value;
    }
}
