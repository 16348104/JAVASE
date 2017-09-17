package NCR.jbcz.circle;

public class TestMemberVariable {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 10;
        System.out.println(Circle.PI);
        System.out.println(c.radius);
        System.out.println(c.PI);

    }
}
