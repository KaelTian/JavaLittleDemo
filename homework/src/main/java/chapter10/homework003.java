package chapter10;

/**
 * @author 田赛
 * @version 1.0
 */
public class homework003 {
}

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
