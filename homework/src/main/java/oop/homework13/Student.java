package oop.homework13;

import oop.Gender;

public class Student extends Person {
    private long stu_id;

    public Student(String name, Gender sex, Integer age, long stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return super.name + "爱踢足球";
    }

    @Override
    public void printInternalInfo() {
        System.out.println("学生的信息:");
        super.printInternalInfo();
        System.out.println("学号: " + this.stu_id);
        this.study();
    }

    private void study() {
        System.out.println("我承诺,我会好好学习");
    }
}
