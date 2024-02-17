package oop.homework3;

import java.util.ArrayList;
import java.util.List;

public class Homework03 {
    public static void main(String[] args) {
        double baseSalary = 1_0000;
        Professor professor = new Professor("田教授", 33, Post.PROFESSOR, baseSalary);
        AssociateProfessor associateProfessor = new AssociateProfessor("郭宇军", 65, Post.ASSOCIATEPROFESSOR, baseSalary);
        Lecturer lecturer = new Lecturer("讲师付公子", 18, Post.LECTURER, baseSalary);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(professor);
        teachers.add(associateProfessor);
        teachers.add(lecturer);
        for (Teacher teacher : teachers) {
            System.out.println(teacher.introduce());
        }
    }
}




