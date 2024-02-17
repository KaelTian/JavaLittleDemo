package codeblock;

public class Practise {
    public static void main(String[] args) {
        System.out.println("Total = " + Person.total);
        System.out.println("New Person Total = " + (new Person()).total);
    }
}

class Person {
    public static int total;

    static {
        total = 100;
        System.out.println("in static block!");
    }
}
