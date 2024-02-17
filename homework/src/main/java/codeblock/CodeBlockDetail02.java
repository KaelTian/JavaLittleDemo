package codeblock;

public class CodeBlockDetail02 {

    public static void main(String[] args) {
        CodeBlockDetail02 detail02 = new CodeBlockDetail02();
        System.out.println("code执行完毕");
    }

    CodeBlockDetail02() {
        System.out.println("CodeBlockDetail02 构造函数初始化");
    }

    int n3 = getN3Value();

    {
        System.out.println("CodeBlockDetail02 普通代码块3");
    }

    {
        System.out.println("CodeBlockDetail02 普通代码块4");
    }

    static int n1 = getN1Value();

    static {
        System.out.println("CodeBlockDetail02 静态代码块1");
    }

    static String n2 = getN2Value();

    static {
        System.out.println("CodeBlockDetail02 静态代码块2");
    }


    static int getN1Value() {
        System.out.println("CodeBlockDetail02 静态value1");
        return 13;
    }

    static String getN2Value() {
        System.out.println("CodeBlockDetail02 静态value2");
        return "车幺妹儿";
    }

    int getN3Value() {
        System.out.println("CodeBlockDetail02 普通value3");
        return 22;
    }


}
