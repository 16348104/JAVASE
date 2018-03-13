package NCR.jbcz.L5_10;

/**
 * Created by zb on 2018/2/25.
 */
abstract class Person {//抽象类声明
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
    public abstract String getDescription();
    //抽象类方法没有方法体
}