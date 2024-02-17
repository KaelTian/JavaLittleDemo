package oop.homework13;

import oop.Gender;
import oop.QuickSort;

import java.util.ArrayList;
import java.util.List;

public class homework13 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Student stu1 = new Student("安宁", Gender.FEMALE, 18, 176655);
        persons.add(stu1);
        Student stu2 = new Student("刘大双", Gender.MALE, 32, 2388661);
        persons.add(stu2);
        Teacher teacher1 = new Teacher("国明军", Gender.MALE, 66, 34);
        persons.add(teacher1);
        Teacher teacher2 = new Teacher("路西法", Gender.FEMALE, 22, 5);
        persons.add(teacher2);
//        persons.add(new Person("灌进去", Gender.MALE, 22));
        QuickSort quickSort = new QuickSort();
        List<Person> newPersons = quickSort.sort(persons, true);
        for (Person newPerson : newPersons) {
            newPerson.printInfo();
            System.out.println("----------------------------------------------------");
        }
    }
}
