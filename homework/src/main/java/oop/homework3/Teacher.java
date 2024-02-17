package oop.homework3;

abstract class Teacher {
    private String name;
    private int age;
    private Post post;
    private double baseSalary;

    protected double baseLevel = 1;

    public Teacher(String name, int age, Post post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.baseSalary = salary;
        setLevel();
    }

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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract void setLevel();

    public String introduce() {
        return "\n当前教师姓名为:" + name + "\t" + "年龄为:" + age + "\t" + "职称为:" + post.getDescription() + "\t" + "工资为:" + baseSalary * baseLevel;
    }
}
