package oop.homework8;

public class Homework08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.02);
        savingsAccount.deposit(12);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(20);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(31);
        System.out.println(savingsAccount.getBalance());
    }
}
