package com.marmar.coursework;

public class Account {
    private long money;

    public Account(long initMoney) {
        if (initMoney < 0) {
            throw new IllegalArgumentException("negative money quantity: " + initMoney);
        }
        this.money = initMoney;
    }

    public void withdraw(long count) throws Exception {
        if (money < count) {
            throw new IllegalStateException("Not enough money on current Account.");
        }
        money -= count;
    }

    public void debit(long count) {
        money += count;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
