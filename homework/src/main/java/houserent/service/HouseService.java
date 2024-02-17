package houserent.service;

import houserent.domain.House;
import houserent.domain.RentalStatus;

public class HouseService {
    private final int invalidIndex = -1;
    private House[] houses;//保存House对象
    private int size = 16;
    private int currentSize = 0;

    public HouseService() {
        houses = new House[size];
    }

    public HouseService(int size) {
        this.size = size;
        houses = new House[this.size];
        //为了方便测试,初始化一个测试对象
        add(new House("韩顺平1", "222", "五十路", 10_000, RentalStatus.Available));
        add(new House("张黛音2", "111", "六字", 10_000, RentalStatus.Rented));
        add(new House("田赛3", "333", "哈哈哈", 10_000, RentalStatus.Rented));
        add(new House("丛围4", "444", "啊啊啊啊", 10_000, RentalStatus.Available));
        add(new House("田赛5", "333", "哈哈哈", 10_000, RentalStatus.Rented));
        add(new House("丛围6", "444", "啊啊啊啊", 10_000, RentalStatus.Available));
    }

    public House[] list() {
        return houses;
    }

    public void add(House house) {
        if (currentSize == size) {
            expandingAndCopySourceHouses();
        }
        houses[currentSize++] = house;
    }

    private void expandingAndCopySourceHouses() {
        size = size * 2;
        System.out.println("house数组扩容,扩容后的容量: " + size);
        House[] cloneHouses = houses.clone();
        houses = new House[size];
        System.arraycopy(cloneHouses, 0, houses, 0, cloneHouses.length);
    }

    /*
     * check whether id contains in houses or not.
     * */
    public boolean containsHouse(int id) {
        return findIndexById(id, 0, currentSize - 1) != invalidIndex;
    }

    public int findIndexById(int id) {
        return findIndexById(id, 0, currentSize - 1);
    }

    private int findIndexById(int id, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            if (houses[middle].getId() == id) {
                return middle;
            } else if (houses[middle].getId() < id) {
                return findIndexById(id, middle + 1, high);
            } else {
                return findIndexById(id, low, middle - 1);
            }
        } else if (low == high) {
            if (houses[low].getId() == id) return low;
        }
        return invalidIndex;
    }

    public void removeHouse(int id) {
        int index = findIndexById(id);
        if (index == invalidIndex) throw new IllegalArgumentException("当前房屋编号: " + id + "不存在");
        int lastItemIndex = currentSize - 1;
        houses[index] = houses[lastItemIndex];
        houses[index].setId(id);
        houses[lastItemIndex] = null;
        currentSize--;
    }

    public int getLength() {
        return currentSize;
    }

    public House getById(int id) {
        int index = findIndexById(id);
        if (index == invalidIndex) return null;
        return houses[index];
    }

    public void updateById(int id, String name, String phone, String address, int rent, RentalStatus rentalStatus) {
        House house = getById(id);
        house.setName(name);
        house.setPhone(phone);
        house.setAddress(address);
        house.setRent(rent);
        house.setRentalStatus(rentalStatus);
    }
}
