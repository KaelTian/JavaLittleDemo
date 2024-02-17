package oop.homework4;

abstract class Employee {
    private String name;
    private double dailySalary;
    private int workDays;
    protected double totalSalary;
    protected EmployeeType employeeType;
    final double baseLevel = 1;

    protected void setTotalSalary() {
        totalSalary = dailySalary * workDays * baseLevel;
    }

    public Employee(String name, double dailySalary, int workDays) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.workDays = workDays;
        setTotalSalary();
    }

    public String printSalary() {
        return "\n" + employeeType.getDescription() + " " + name + "的工资为: " + totalSalary;
    }
}
