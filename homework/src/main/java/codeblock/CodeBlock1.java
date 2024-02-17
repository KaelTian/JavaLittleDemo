package codeblock;

public class CodeBlock1 {

    public static void main(String[] args) {
        Movie movie1 = new Movie("大头儿子");

        Movie movie2 = new Movie("大头儿子", 100);

        Movie movie3 = new Movie("大头儿子", 100, "阿里云");

        System.out.println("程序调用完毕");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;


    /*
     * 静态代码块(在整个程序生命周期内,在类对象加载时,只会调用一次)
     * */
    static {
        System.out.println("Movie全体初始化!");
    }

    /*
     * 类初始化以后代码便会执行
     * */ {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }

    public Movie(String name) {
        System.out.println("Movie(String name) 被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price) 被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) 被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
