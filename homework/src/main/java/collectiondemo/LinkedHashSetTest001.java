package collectiondemo;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author 田赛
 * @version 1.0
 */
public class LinkedHashSetTest001 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
//        for (int i = 0; i < 20; i++) {
//            Employee employee = new Employee("abby" + i, i + 1);
//            System.out.println("hashcode:" + employee.hashCode());
//            if (i == 10) {
//
//            }
//        }
        linkedHashSet.add(new Car("艾比", 123));
        linkedHashSet.add(new Car("艾虎", 123));
        linkedHashSet.add(new Car("艾比", 123));
        linkedHashSet.add(new Car("艾比", 123));
        linkedHashSet.add(new MyCar("卡尔的车", 123));
        linkedHashSet.add(new MyCar("卡尔的车", 123));
        linkedHashSet.add(new MyCar("卡尔的车", 123));
        linkedHashSet.add(new MyCar("丛围的车", 123));
        System.out.println("linkedhashset=" + linkedHashSet);
    }
}

class Car {

    protected String name;
    protected double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected String getDescription(String header) {
        return header + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String toString() {
        return getDescription("Car");
    }
}

class MyCar extends Car {
    public MyCar(String name, double price) {
        super(name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCar car = (MyCar) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return getDescription("MyCar");
    }
}
