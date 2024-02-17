package com.kaeledu.smallchange;

import java.util.ArrayList;
import java.util.List;

public class SmallChangeOOP {
    private double balance;
    private List<SmallChangeOOPDetail> actionDetails = new ArrayList<>();

    /*
     * 零钱通明细
     * */
    public void getChangeDetails() {
        for (SmallChangeOOPDetail actionDetail : actionDetails) {
            System.out.println(actionDetail.toString());
        }
    }

    public void income(double money) {
        if (!isValidIncome(money)) {
            throw new IllegalArgumentException("收益入账不能是负数");
        } else {
            balance += money;
            SmallChangeOOPDetail actionDetail = new SmallChangeOOPDetail("收益入账", SmallChangeOOPAction.INCOME, money, balance);
            actionDetails.add(actionDetail);
        }
    }

    public void consumption(double money, String actionName) {
        if (!isValidConsumption(money)) {
            throw new IllegalArgumentException("消费金额不能大于当前余额: " + balance);
        } else {
            balance -= money;
            SmallChangeOOPDetail actionDetail = new SmallChangeOOPDetail(actionName, SmallChangeOOPAction.CONSUMPTION, money, balance);
            actionDetails.add(actionDetail);
        }
    }

    public boolean isValidConsumption(double money) {
        return (balance - money) > -1;
    }

    public boolean isValidIncome(double money) {
        return money > -1;
    }
}


