package oop.homework10;

import oop.Gender;

public class homework10 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("kael", 33, "developer", Gender.MALE, 10800);
        {
            Doctor d2 = new Doctor("kael", 33, "developer", Gender.MALE, 10800);
            System.out.println(d1.equals(d2));
            System.out.println(d1.equals(null));
            System.out.println(d1.equals(3));
            System.out.println(d1.equals(d1));
        }
        {
            Doctor d3 = new Doctor("kael1", 33, "developer", Gender.MALE, 10800);
            System.out.println(d1.equals(d3));
        }
        {
            Doctor d4 = new Doctor("kael", 34, "developer", Gender.MALE, 10800);
            System.out.println(d1.equals(d4));
        }
        {
            Doctor d5 = new Doctor("kael", 33, "developer_lol", Gender.MALE, 10800);
            System.out.println(d1.equals(d5));
        }
        {
            Doctor d6 = new Doctor("kael", 33, "developer", Gender.FEMALE, 10800);
            System.out.println(d1.equals(d6));
        }
        {
            Doctor d7 = new Doctor("kael", 33, "developer", Gender.MALE, 10800.5);
            System.out.println(d1.equals(d7));
        }
    }
}
