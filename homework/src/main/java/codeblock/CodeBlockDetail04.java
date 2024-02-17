package codeblock;


public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
    }
}

/*
 * 父类
 * */
class A02 {
    private static int n1 = getVal01();

    static {
        System.out.println("A02 的一个静态代码块");
    }

    {
        System.out.println("A02 的一个普通代码块");
    }

    public int n3 = getVal02();

    private int getVal02() {
        System.out.println("getVal02");
        return 10;
    }

    private static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }

    public A02() {
        //递归父类的静态代码块和属性
        //super()
        //普通代码块和普通属性
        System.out.println("A02的构造器");
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();

    static {
        System.out.println("这是B02的一个静态代码块..");
    }

    public int n5 = getVal04();

    {
        System.out.println("这是B02的第一个普通代码块..");
    }

    private int getVal04() {
        System.out.println("getVal04");
        return 10;
    }

    private static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }

    public B02() {
        System.out.println("B02的构造器");
    }
}

class C02 {
    private int n1 = 100;
    private static int n2 = 200;

    private void m1() {

    }

    private static void m2() {

    }

    static {
        //静态代码块,只能调用静态成员
        //System.out.println(n1);//error
        System.out.println(n2);
        //m1();//error
        m2();
    }

    {
        //普通代码块,可以调用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}
