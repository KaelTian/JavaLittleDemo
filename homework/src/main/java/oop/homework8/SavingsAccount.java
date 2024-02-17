package oop.homework8;

import java.time.LocalDate;
import java.time.Period;


public class SavingsAccount extends BankAccount {
    private double interestRate;

    private final LocalDate initialDate;

    private int calculateInterestTimes = 0;

    private int chargeServiceCount = 0;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
        initialDate = LocalDate.of(2023, 6, 28);
    }

    private void resetChargeServiceCount() {
        chargeServiceCount = -3;
    }

    private void increaseChargeServiceCount() {
        chargeServiceCount++;
    }


    private int getMonthsInterval() {
        LocalDate currentDate = LocalDate.now();
        // 计算当前日期与指定日期之间的间隔
        Period period = Period.between(initialDate, currentDate);

        // 计算整数月份间隔
        int monthsInterval = period.getYears() * 12 + period.getMonths();
        return monthsInterval;
    }

    private void earnMonthlyInterest() {
        if (getMonthsInterval() > calculateInterestTimes) {
            int interestTimes = getMonthsInterval() - calculateInterestTimes;
            for (int index = 0; index < interestTimes; index++, calculateInterestTimes++) {
                double oldBalance = super.getBalance();
                double interestBalance = oldBalance * interestRate;
                super.deposit(interestBalance);
            }
            resetChargeServiceCount();
        }
    }

    private boolean shouldEarnMonthlyInterest() {
        return getMonthsInterval() - calculateInterestTimes > 0;
    }

    private boolean shouldChargeService() {
        return chargeServiceCount > -1;
    }

    //存款
    @Override
    public void deposit(double amount) {
        if (shouldEarnMonthlyInterest()) {
            earnMonthlyInterest();
        }
        if (shouldChargeService()) {
            amount -= 1;
        }
        super.deposit(amount);
        increaseChargeServiceCount();
    }

    //取款
    @Override
    public void withdraw(double amount) {
        if (shouldEarnMonthlyInterest()) {
            earnMonthlyInterest();
        }
        if (shouldChargeService()) {
            amount += 1;
        }
        super.withdraw(amount);
        increaseChargeServiceCount();
    }
}
