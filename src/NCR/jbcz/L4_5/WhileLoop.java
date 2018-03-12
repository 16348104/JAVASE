package NCR.jbcz.L4_5;


/**
 * Created by dell on 2018/2/17.
 */
public class WhileLoop {
    public static void main(String[] args) {
        int score = 60;
        int sum = 0;
        int i = 1;
        while ((score >= 60) && (i <= 10)) {
            score = (int) (Math.random() * 100);
            System.out.print(score + ",");
            sum += sum;
            i++;
        }
        System.out.println();
        if ((i == 10) && ((score / i) >= 80)) {
            System.out.println("团队测试通过");
        } else {
            System.out.println("团队测试未通过");
        }
    }

}

