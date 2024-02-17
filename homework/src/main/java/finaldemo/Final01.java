package finaldemo;

public class Final01 {
}


final class A {
}

//class B extends A {}

class C {
    //hi 方法不能被重写
    public final void hi() {
    }
}

class D extends C {
//    @Override
//    public void hi(){
//
//    }
}

class E {
    public final double TAX_RATE = 0.08;
}

class F {
    public void cry() {
        final double NUM = 0.01;
        System.out.println("NUM=" + NUM);
    }
}


