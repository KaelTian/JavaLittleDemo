package collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 田赛
 * @version 1.0
 */
public class HashSetTest002 {
    public static void main(String[] args) {
        Employee e1 = new Employee("kaeltian", 11);
        Employee e2 = new Employee("kaeltian", 11);
        Employee e3 = new Employee("千鸟!", 11);
        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3);

        HashSet hashSet1 = new HashSet();
        hashSet1.add(e1);
        hashSet1.add(e2);
        hashSet1.add(e3);

        System.out.println("hashset=" + hashSet1);
        for (Employee employee : hashSet) {
            System.out.println(employee);
        }

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(e1);
        linkedHashSet.add(e2);
        linkedHashSet.add(e3);
        System.out.println("LinkedHashSet=" + hashSet1);
    }
}

