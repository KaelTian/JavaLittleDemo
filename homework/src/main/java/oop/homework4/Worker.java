package oop.homework4;

class Worker extends Employee {
    public Worker(String name, double dailySalary, int workDays) {
        super(name, dailySalary, workDays);
        super.employeeType = EmployeeType.WORKER;
    }
}
