package NCR.jbcz.L11_5;

/**
 * Created by zb on 2018/3/13.
 * 对象数组
 */
public class IceCream {
    //创建对象有10个String对象
    static String[] breed = {"巧克力", "香草", "草莓", "朗姆酒", "咖啡", "果仁", "香芋", "绿茶", "榛子", "葡萄干"};

    static String[] breedSet(int n) {                 //产生随机排列的数组，长度由参数n确定
        n = Math.abs(n) % (breed.length + 1);         //n是正整数并且不越界
        String[] result = new String[n];
        int[] picks = new int[n];
        for (int i = 0; i < picks.length; i++) {
            picks[i] = -i;
        }
        for (int i = 0; i < picks.length; i++){
            retry:
            while (true) {
                int t = (int) (Math.random() * breed.length);
                for (int j = 0; j < i; j++) {
                    if (picks[j] == t) {
                        continue  retry;
                    }
                }
                    picks[i] = t;
                    result[i] = breed[t];
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("breedSet()=");
            String[] be = breedSet(breed.length);
            for (int j = 0; j < be.length; j++) {
                System.out.println("\t"+be[j]);
            }
            System.out.println();
        }
    }
}