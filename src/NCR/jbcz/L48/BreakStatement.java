package NCR.jbcz.L48;

/**
 * Created by dell on 2018/2/18.
 */
public class BreakStatement {
    public static void main(String[] args) {
        int s,count=0,sum=0;
        for (int i = 0; i < 10; i++) {
            s = (int) (Math.random() * 100);
            System.out.print(s + ",");
            if (s <= 60) {
                break;
            }
            sum+=s;
            count++;
        }
        System.out.println();
        if ((count==10)&&(sum/count)>=80) {
            System.out.println("团队测试通过");
        } else {
            System.out.println("团队测试未通过");
        }
    }
}
