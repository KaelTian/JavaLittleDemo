package chapter10;

/**
 * @author 田赛
 * @version 1.0
 */
public class Homework006 {
    public static void main(String[] args) {
        Person tangseng = new Person("唐僧", VehiclesFactory.getVehiclesByType(VehiclesEnum.HORSE));
        tangseng.getVehicles().work();
        tangseng.setVehicles(VehiclesFactory.getVehiclesByType(VehiclesEnum.BOAT));
        tangseng.getVehicles().work();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("我是一匹马,我在陆地上行走");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("我是一艘船,我在水里跑");
    }
}

enum VehiclesEnum {
    HORSE,
    BOAT
}

class VehiclesFactory {
    public static Vehicles getVehiclesByType(VehiclesEnum type) {
        switch (type) {
            case HORSE:
                return new Horse();
            case BOAT:
                return new Boat();
            default:
                throw new IllegalArgumentException("类型不正确,无法初始化合理的交通工具类型");
        }
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

}
