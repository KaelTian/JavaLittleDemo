package oop.homework14;

class C extends B {
    public C() {
        this("hello");
        System.out.println("我是C类的午餐构造");
    }

    public C(String name) {
        super("hahaha");
        System.out.println("我是C类的有参构造");
    }
}
