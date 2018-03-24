package NCR.jbcz.TEST.L3;

public class test3 {
    public static void main(String[] args) {
        int i = 3, j;
        outer:
        while (i > 0) {
            j = 3;
            inner:
            while (j > 0) {
                if (j < 2) {
                    break outer;
                }
                System.out.println(j + "and" + i);
                j--;
            }
            i--;
        }

    }
}
