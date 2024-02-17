package oop.homework4;

enum EmployeeType {
    WORKER("普通员工"),
    MANAGER("部门经理");

    private final String description;

    private EmployeeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
