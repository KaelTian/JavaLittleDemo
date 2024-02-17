package oop.homework3;

public class Lecturer extends Teacher {
    public Lecturer(String name, int age, Post post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void setLevel() {
        baseLevel *= 1.1;
    }
}
