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
        String[] result = new String[n];             //创建对象数组存放随机抽取的冰淇凌种类
        int[] picks = new int[n];                    //创建数组存放抽取的下标
        for (int i = 0; i < picks.length; i++) {
            picks[i] = -i;
        }
        for (int i = 0; i < picks.length; i++) {      //随机抽出冰淇凌的种类牌类的循环，如提取重复返回重选，如果不重复写入result数组
            retry:
            while (true) {
                int t = (int) (Math.random() * breed.length);
                for (int j = 0; j < i; j++) {
                    if (picks[j] == t) {             //如果下标重复，重置随机数，picks【】用于记录已提取元素下标
                        continue retry;
                    }
                }
                picks[i] = t;
                result[i] = breed[t];//将提取的元素存入result中
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
                System.out.println("\t" + be[j]);
            }
            System.out.println();
        }
    }
}