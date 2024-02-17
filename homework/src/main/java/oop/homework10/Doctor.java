package oop.homework10;

import oop.Gender;

import java.util.Objects;

class Doctor {
    private String name;
    public int age;
    public String job;

    public Gender gender;

    public double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Doctor(String name, int age, String job, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, job, gender, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age &&
                Double.compare(salary, doctor.salary) == 0 &&
                Objects.equals(name, doctor.name) &&
                Objects.equals(job, doctor.job) &&
                gender == doctor.gender;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Doctor doctor = (Doctor) o;
//        return age == doctor.age && Double.compare(doctor.salary, salary) == 0 && Objects.equals(name, doctor.name) && Objects.equals(job, doctor.job) && gender == doctor.gender;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, job, gender, salary);
//    }
}
