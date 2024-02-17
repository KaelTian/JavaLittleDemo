package oop.homework13;

import oop.CompareService;
import oop.Gender;
import oop.GenericClass;

public abstract class Person extends GenericClass<Person> implements Comparable<Person>, CompareService<Person> {
    protected String name;

    private Gender sex;

    public Integer age;

    public Person(String name, Gender sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public abstract String play();

    protected void printInternalInfo() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("性别: " + sex.getDescription());
    }

    public void printInfo() {
        printInternalInfo();
        System.out.println(play());
    }

    @Override
    public int compareTo(Person other) {
        return this.age.compareTo(other.age);
    }

    @Override
    public boolean isGreaterThan(Person other) {
        return this.compareTo(other) > 0;
    }

    @Override
    public boolean isLessThan(Person other) {
        return this.compareTo(other) < 0;
    }

    @Override
    public Class<Person> getType() {
        return super.getType();
    }
}
