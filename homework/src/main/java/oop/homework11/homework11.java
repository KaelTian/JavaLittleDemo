package oop.homework11;

public class homework11 {
    public static void main(String[] args) {
        Person p1 = new Student();

        p1.run();
        p1.eat();
        ((Student) p1).study();

        try {
            Person p3 = new Person();
            ((Student) p3).study();
        } catch (Exception ex) {
            System.out.println(ex);
        }


        Person p3 = new Student();
        if (p3 instanceof Student) {
            Student student = (Student) p3;
            student.study();
            student.run();
        }

//        Person p2 = new Person();
//        Student s1 = (Student) p2;
//        s1.run();
//        s1.eat();
//        s1.study();
    }
}
