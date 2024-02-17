package houserent.domain;

public class House {
    private static int nextId = 1; // 静态变量用于追踪下一个ID
    private int id; // 对象的ID属性

    private String name;

    private String phone;

    private String address;

    private int rent;

    private RentalStatus rentalStatus;

    public House(String name, String phone, String address, int rent, RentalStatus rentalStatus) {
        this.id = (nextId++);
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.rentalStatus = rentalStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public RentalStatus getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(RentalStatus rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    //为了方便的输出对象信息,实现toString
    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t" + phone +
                "\t\t" + address +
                "\t" + rent +
                "\t" + rentalStatus.getDescription();
    }
}
