package oop;

/*
 * 写出四中访问修饰符和各自的访问权限
 * */
public class Homework02 {

    public Homework02() {
        defaultClass = new DefaultClass();
        defaultClass.Description = "田卡";
    }

    private String name;
    public int age;
    protected boolean isMale;
    long money;

    DefaultClass defaultClass;
}

/*
 *  default 不使用任何修饰符,默认情况下具有包级别的私有权限
 */
class DefaultClass {
    String Description;
}
