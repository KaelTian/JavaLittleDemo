package com.kaeledu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SmallChangeOOPDetail {
    public String actionName;

    public SmallChangeOOPAction actionType;

    public Date actionTime;

    public double money;

    public double balance;

    public SmallChangeOOPDetail(String actionName, SmallChangeOOPAction actionType, double money, double balance) {
        this.actionName = actionName;
        this.actionType = actionType;
        this.money = money;
        this.balance = balance;
        this.actionTime = new Date();
    }

    @Override
    public String toString() {
        return "\n" + actionName + "\t" + actionType.getDescription() + money + "\t" + formatDate(actionTime) + "\t余额: " + balance;
    }

    private String formatDate(Date date) {
        // 创建SimpleDateFormat对象，指定日期时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 使用SimpleDateFormat格式化Date对象
        return dateFormat.format(date);
    }
}
