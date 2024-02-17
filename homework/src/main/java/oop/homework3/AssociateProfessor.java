package oop.homework3;

public class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, Post post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void setLevel() {
        baseLevel *= 1.2;
    }
}
