package oop.homework3;

class Professor extends Teacher {
    public Professor(String name, int age, Post post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void setLevel() {
        baseLevel *= 1.3;
    }
}
