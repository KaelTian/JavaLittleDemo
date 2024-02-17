package oop.homework4;

class Manager extends Employee {
    public Manager(String name, double dailySalary, int workDays) {
        super(name, dailySalary, workDays);
        super.employeeType = EmployeeType.MANAGER;
    }

    @Override
    protected void setTotalSalary() {
        super.setTotalSalary();
        totalSalary = totalSalary * 1.2 + 1000;
    }
}
