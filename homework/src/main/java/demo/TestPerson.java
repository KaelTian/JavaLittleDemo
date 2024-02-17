package demo;

public class TestPerson {
    public static void main(String[] args) {
        Person.setTotalPerson(33);
        new Person();
    }
}

class Person {
    private int id;
    private static int total = 0;

    public static int getTotalPerson() {
        //id++;
        return total;
    }

    public static void setTotalPerson(int total) {
        //this.total=total;
        total = total;
    }

    public Person() {
        total++;
        id = total;
    }
}
