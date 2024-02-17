package codeblock;

public class CodeBlock2 {
    public static void main(String[] args) {
        //System.out.println("B's totalNum is: " + B.totalNum + "");

//        //类被加载的情况
//        //1. 创建对象实例时(new)
//
//        A a = new A();
//
//        //2. 子类创建对象时,父类也会被加载
//        B b = new B();

        //3. 使用类的静态成员时(静态属性,静态方法)
        System.out.println("Cat's n1 is: " + Cat.n1 + "");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
    }
}

class A {
    private int n1 = 10;

    static {
        System.out.println("A static");
    }
}

class B extends A {
    private int n2 = 20;
    public static int totalNum = 100;

    static {
        System.out.println("B static");
    }
}

class Cat extends B {
    public static int n1 = 109;

    static {
        System.out.println("Cat 的静态代码块被执行");
    }

    {
        System.out.println("Cat 的普通代码块被执行");
    }
}
