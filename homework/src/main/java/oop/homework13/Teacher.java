package oop.homework13;

import oop.Gender;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, Gender sex, Integer age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    @Override
    public String play() {
        return super.name + "爱下象棋";
    }

    @Override
    public void printInternalInfo() {
        System.out.println("老师的信息:");
        super.printInternalInfo();
        System.out.println("工龄: " + this.work_age);
        this.teach();
    }

    private void teach() {
        System.out.println("我承诺,我会认真教学");
    }
}
