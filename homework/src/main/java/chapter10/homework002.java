package chapter10;

/**
 * @author 田赛
 * @version 1.0
 */
public class homework002 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());
    }
}

class Frock {
    private static int currentNum = 10000;

    public int getSerialNumber() {
        return serialNumber;
    }

    private int serialNumber;

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public Frock() {
        serialNumber = getNextNum();
    }
}
