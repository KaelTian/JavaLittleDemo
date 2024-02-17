package wrapperdemo;

/**
 * @author 田赛
 * @version 1.0
 */
public class WrapperType {
    public static void main(String[] args) {
//        //演示int <--> Integer 的装箱和拆箱
//        int n1 = 100;
//        //手动装箱 start
//        Integer integer = new Integer(n1);
//        Integer integer1 = Integer.valueOf(n1);
//        //手动装箱
//
//        //手动拆箱
//        //Integer -> int
//        int i = integer.intValue();
//
//        //jdk5以后,就可以自动装箱和拆箱
//        //自动装箱
//        Integer integer2 = n1;//底层使用的是 Integer.valueOf(n1);
//        System.out.println(integer2);
//        //自动拆箱
//        int n3 = integer2;//底层使用的是 integer2.intValue()'
//        System.out.println(n3);
//        System.out.println("执行成功!");


//        Double d = 100d;
//        Float f = 1.5f;
//
//        Object obj1 = true ? new Integer(1) : new Double(2.0);
//        System.out.println(obj1);
//
//        Object obj2;
//        if (true)
//            obj2 = new Integer(1);
//        else
//            obj2 = new Double(2.0);
//        System.out.println(obj2);
        integerTest1();
    }

    static void integerTest1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
