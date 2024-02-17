package houserent.view;

import houserent.domain.House;
import houserent.domain.RentalStatus;
import houserent.service.HouseService;
import houserent.utils.Utility;

/*
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService完成对房屋信息的操作
 * */
public class HouseView {
    private boolean loop = true;//是否显示菜单
    private char key = ' '; //接收用户输入的选项

    private HouseService houseService;

    public HouseView() {
        houseService = new HouseService(2);
    }

    public void mainMenu() {
        do {
            System.out.println("======================房屋出租系统======================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 信 息");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    removeHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    private void listHouses() {
        System.out.println("======================房屋列表======================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house != null) System.out.println(house);
        }
        System.out.println("======================房屋列表显示完毕======================");
    }

    private void addHouse() {
        System.out.println("======================添加房屋======================");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态(已出租/未出租): ");
        String rentalStatusStr = Utility.readString(3);
        RentalStatus rentalStatus = null;
        if (rentalStatusStr.equalsIgnoreCase("未出租")) {
            rentalStatus = RentalStatus.Available;
        } else if (rentalStatusStr.equalsIgnoreCase("已出租")) {
            rentalStatus = RentalStatus.Rented;
        } else {
            System.out.println("状态值错误,请输入(已出租/未出租)");
            return;
        }
        houseService.add(new House(name, phone, address, rent, rentalStatus));
        System.out.println("======================添加房屋完毕======================");
    }

    private void removeHouse() {
        System.out.println("======================删除房屋======================");
        System.out.print("请选择待删除房屋编号(-1退出): ");
        int id = Utility.readInt();
        if (id == -1) return;
        char choice = Utility.readConfirmSelection();//该方法本身拥有循环判断的逻辑,合法值只有Y/N
        if (choice == 'Y') {
            boolean containsId = houseService.containsHouse(id);
            if (!containsId) {
                System.out.println("当前房屋编号不存在");
                return;
            }
            houseService.removeHouse(id);
            System.out.println("当前房屋长度: " + houseService.getLength());
            System.out.println("======================删除房屋完毕======================");
        } else {
            System.out.println("删除失败!!!");
        }
    }

    private void findHouse() {
        System.out.println("======================查找房屋======================");
        System.out.print("请输入查找房屋编号(-1退出): ");
        int id = Utility.readInt();
        if (id == -1) return;
        boolean containsHouse = houseService.containsHouse(id);
        if (!containsHouse) {
            System.out.println("不存在当前编号的房屋,直接退出");
        } else {
            House house = houseService.getById(id);
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
            System.out.println(house);
        }
        System.out.println("======================查找房屋完毕======================");
    }

    private void updateHouse() {
        System.out.println("======================更新房屋======================");
        System.out.print("请输入更新的房屋编号(-1退出): ");
        int id = Utility.readInt();
        if (!houseService.containsHouse(id)) {
            System.out.println("不存在当前编号的房屋,直接退出");
        } else {
            House currentHouse = houseService.getById(id);

            System.out.print("姓名(" + currentHouse.getName() + "): ");
            String name = Utility.readString(8, currentHouse.getName());

            System.out.print("电话(" + currentHouse.getPhone() + "): ");
            String phone = Utility.readString(12, currentHouse.getPhone());

            System.out.print("地址(" + currentHouse.getAddress() + "): ");
            String address = Utility.readString(16, currentHouse.getAddress());

            System.out.print("月租(" + currentHouse.getRent() + "): ");
            int rent = Utility.readInt(currentHouse.getRent());

            System.out.print("状态(" + currentHouse.getRentalStatus().getDescription() + "): ");
            String rentalStatusStr = Utility.readString(3, currentHouse.getRentalStatus().getDescription());
            RentalStatus rentalStatus = null;
            if (rentalStatusStr.equalsIgnoreCase("未出租")) {
                rentalStatus = RentalStatus.Available;
            } else if (rentalStatusStr.equalsIgnoreCase("已出租")) {
                rentalStatus = RentalStatus.Rented;
            } else {
                System.out.println("状态值错误,请输入(已出租/未出租)");
                return;
            }

            houseService.updateById(id, name, phone, address, rent, rentalStatus);
            System.out.println("======================更新房屋完毕======================");
        }
    }

    private void exit() {
        System.out.println("======================房屋退出======================");
        char key = Utility.readConfirmSelection();
        if (key == 'Y') {
            loop = false;
        }
    }
}
