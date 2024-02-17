package collectiondemo;

import java.util.*;

/**
 * @author 田赛
 * @version 1.0
 */
public class CollectionDemo1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList(2);
//        arrayList.add("kael tian");
//        arrayList.add("abby zhang");
//        arrayList.add("abby zhang1");
//        arrayList.add("abby zhang2");
//        arrayList.add("abby zhang3");
//
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//        hashMap.put(1, "汉顺平");
//        hashMap.put(2, "LOL");
//
//        HashSet set = new HashSet();
//        set.add("kael");
//        set.add("kael");
//        set.add("luck");
//        set.add("kael111");
//        set.add(null);
//        set.add(null);
//
//
//        int hash1 = hash(new String("lol"));
//        int hash2 = hash(new String("lol"));
//        int hash3 = hash("郭宇军");
//        int hash4 = hash("郭宇军");
        int loopCount = 100;
        TimeStop timeStop = new TimeStop();
        timeStop.start();
        HashSet<HashMapDemoBase> hashSet = new HashSet();
        for (int i = 1; i <= loopCount; i++) {
            if(i==50){
                System.out.println("hello");
            }
            hashSet.add(new HashMapDemoBase(i, "abby" + i, "kael" + i));
        }
        timeStop.stop();
        System.out.println("输出add1的执行时间: " + timeStop.elapsedTime().toMillis());

        timeStop.start();
        int count = 0;
        for (HashMapDemoBase item : hashSet) {
            count += 1;
        }
        timeStop.stop();
        System.out.println("输出遍历HashMapDemoBase集合的执行时间: " + timeStop.elapsedTime().toMillis());

        timeStop.start();
        HashSet<HashMapDemoWithOtherHashCode> hashSet1 = new HashSet();
        for (int i = 1; i <= loopCount; i++) {
            hashSet1.add(new HashMapDemoWithOtherHashCode(i, "abby" + i, "kael" + i));
        }
        timeStop.stop();
        System.out.println("输出add2的执行时间: " + timeStop.elapsedTime().toMillis());

        timeStop.start();
        int count1 = 0;
        for (HashMapDemoWithOtherHashCode item : hashSet1) {
            count1 += 1;
        }
        timeStop.stop();
        System.out.println("输出遍历HashMapDemoWithOtherHashCode集合的执行时间: " + timeStop.elapsedTime().toMillis());
//        HashMapDemo demo1 = new HashMapDemo(100, "01", "001");
//        HashMapDemo demo2 = new HashMapDemo(100, "02", "002");
//        HashMapDemo demo3 = new HashMapDemo(100, "03", "003");
//        HashMapDemo demo4 = new HashMapDemo(100, "04", "004");
//        HashMapDemo demo5 = new HashMapDemo(100, "05", "005");
//        HashMapDemo demo6 = new HashMapDemo(100, "06", "006");
//        HashMapDemo demo7 = new HashMapDemo(100, "07", "007");
//        HashMapDemo demo8 = new HashMapDemo(100, "08", "008");
//        HashMapDemo demo9 = new HashMapDemo(100, "09", "009");
//        HashMapDemo demo10 = new HashMapDemo(100, "10", "0010");
//
//
//        hashSet.add(demo1);
//        hashSet.add(demo2);
//        hashSet.add(demo3);
//        hashSet.add(demo4);
//        hashSet.add(demo5);
//        hashSet.add(demo6);
//        hashSet.add(demo7);
//        hashSet.add(demo8);
//        hashSet.add(demo9);
//        hashSet.add(demo10);
    }


    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


}

class HashMapDemoBase {
    protected final int code;
    protected final String name;

    protected final String description;

    public HashMapDemoBase(int code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashMapDemoBase that = (HashMapDemoBase) o;
        return that.getCode() == this.code && Objects.equals(name, that.name) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

class HashMapDemoWithOtherHashCode extends HashMapDemoBase {

    public HashMapDemoWithOtherHashCode(int code, String name, String description) {
        super(code, name, description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }
}
