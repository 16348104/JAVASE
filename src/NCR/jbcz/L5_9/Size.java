package NCR.jbcz.L5_9;

/**
 * Created by zb on 2018/2/25.
 */
 enum Size {
    SMALL("s"),MEDIUM("m"),LARGE("l"),EXTRA_LARGE("XL"), EXTRA_EXTRA_LARGE("XXL");
    private final String abbreviation;

    private Size(String abbreviation ){   //枚举类型也可以有自己的构造方法，this表示在构造方法内引用构造方法的对象
        this.abbreviation = abbreviation;
    }

    public String getabbreviation() {//枚举类型也可以有自己的成员方法
        return abbreviation;
    }
}


