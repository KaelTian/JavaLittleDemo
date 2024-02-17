package chapter10;

/**
 * @author 田赛
 * @version 1.0
 */
public class homework001 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(100);
        System.out.println(c);//9,red
        System.out.println(c1);//100,red
    }
}

class Car {
    double price = 10;
    static String color = "white";

    public Car() {
        this.price = 9;
        color = "red";
    }

    public Car(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return price + "\t" + color;
    }
}
