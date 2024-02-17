package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 田赛
 * @version 1.0
 */
public class LINQDemo001 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("田卡", 18),
                new Employee("甜甜", 8),
                new Employee("布隆", 35),
                new Employee("洛基", 7));
        List<Employee> adults = employees.stream().filter(a -> a.getAge() > 17)
                .collect(Collectors.toList());
        System.out.println(adults);
    }
}
