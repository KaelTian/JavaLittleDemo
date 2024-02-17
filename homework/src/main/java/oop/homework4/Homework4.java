package oop.homework4;

import java.util.ArrayList;
import java.util.List;

public class Homework4 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("田卡", 800, 10));
        employees.add(new Worker("成龙", 300, 5));
        for (Employee employee : employees) {
            System.out.println(employee.printSalary());
        }
    }
}
