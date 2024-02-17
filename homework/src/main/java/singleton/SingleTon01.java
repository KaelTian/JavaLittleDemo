package singleton;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);
    }
}

/*
 * 饿汉模式的单例(饿汉模式可能创建了对象,但是没有使用)
 * */
class GirlFriend {
    private String name;

    private static GirlFriend gf = new GirlFriend("大雷子");

    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name=" + name + "}";
    }
}
