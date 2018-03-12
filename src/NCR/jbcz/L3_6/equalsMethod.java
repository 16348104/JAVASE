package NCR.jbcz.L3_6;


public class equalsMethod {
    void method() {
        int i = 10, j = 15;
        System.out.println(i == j);
        String s1 = new String("how are you");
        String s2 = new String("how are you");
        System.out.println(s1 == s2);
    }

    public static void main(String[] args) {
        equalsMethod equalsMethod = new equalsMethod();
        equalsMethod.method();
    }

}