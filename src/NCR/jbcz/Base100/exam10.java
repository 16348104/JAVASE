package NCR.jbcz.Base100;

/**
 * Created by zb on 2018/4/12.
 * 随机产生50个0-100的随机数，并计算70-80间随机数的个数（包括70，不包括80）
 */
public class exam10 {
    public static void main(String[] args) {
        int result=0;
        int i=0;
        int randomNum;
        while (i<50){
            randomNum= (int)(Math.random()*100);
            if (randomNum>=70&&randomNum<80) {
                result++;
                i++;
            }
        }
        System.out.println("result="+result);
    }
}