package NCR.jbcz.L35;

public class Operators {
    void priority() {
        int a = 10, b = 4, c = 20, d = 6;
        System.out.println(a + b * c + d);
        System.out.println(a + c % b);
        System.out.println(a++ * b + c * --d);
    }

    public static void main(String args[]) {
        Operators operators = new Operators();
        operators.priority();

    }
}