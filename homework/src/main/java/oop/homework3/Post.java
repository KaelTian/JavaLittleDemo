package oop.homework3;

enum Post {
    PROFESSOR("教授"),
    ASSOCIATEPROFESSOR("副教授"),
    LECTURER("讲师"),
    ASSISTANTPROFESSOR("助理教授"),
    SENIORLECTURER("高级讲师");

    private final String description;

    private Post(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
