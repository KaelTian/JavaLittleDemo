package com.kaeledu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    //操作步骤
    //1. 先完成显示菜单,并可以选择菜单,给出对应提示
    //2. 完成零钱通明细
    public static void main(String[] args) {
        //1定义相关的变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        //2. 完成零钱通明细
        //3. 完成收益入账 完成功能驱动程序猿增加新的变化与代码
        double money = 0;
        SmallChangeOOP smallChangeOOP = new SmallChangeOOP();
        do {
            System.out.println("\n==================零钱通菜单==================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退      出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            //使用switch 分支控制
            switch (key) {
                case "1":
                    System.out.println("零钱通明细如下:");
                    smallChangeOOP.getChangeDetails();
                    break;
                case "2":
                    System.out.println("请输入收益入账:");
                    money = scanner.nextDouble();
                    //money 的值范围应该校验 => 一会儿再完善
                    if (!smallChangeOOP.isValidIncome(money)) {
                        System.out.println("收益不能是负数,重新选择");
                    } else {
                        smallChangeOOP.income(money);
                    }
                    break;
                case "3":
                    System.out.println("请输入消费金额");
                    money = scanner.nextDouble();
                    //消费金额大于余额是不行的
                    if (!smallChangeOOP.isValidConsumption(money)) {
                        System.out.println("消费不能多于余额,重新选择");
                    } else {
                        System.out.println("请输入消费项目:");
                        String actionName = scanner.next();
                        smallChangeOOP.consumption(money, actionName);
                    }
                    break;
                case "4":
                    System.out.println("4 退      出");
                    String quitMessage = "你确定要退出吗? y/n,必须输入正确的y/n,否则循环输入指令,直到输入y或者n";
                    System.out.println(quitMessage);
                    String ensureMessage = scanner.next();
                    while (true) {
                        if (ensureMessage.equals("y")) {
                            loop = false;
                            break;
                        } else if (ensureMessage.equals("n")) {
                            break;
                        } else {
                            System.out.println(quitMessage);
                            ensureMessage = scanner.next();
                        }
                    }
                    break;
                default:
                    System.out.println("选择有误,请重新选择");
            }
        } while (loop);
        System.out.println("----------退出了零钱通项目----------");
    }
}
