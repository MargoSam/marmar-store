package com.marmar.coursework.user;

import com.marmar.coursework.Account;
import com.marmar.coursework.order.Order;
import com.marmar.coursework.product.Product;

import java.time.LocalDateTime;

public class User {
    private final UserData userData;
    private UserAddressBook userAddressBook;
    private Favorites favorites;
    private UserOrdersHistory ordersHistory;
    private Account account;
    private Order currentOrder = new Order();

    public User(UserData userData) {
        this.userData = userData;
    }

    public void addProduct(Product product, int count) {
        currentOrder.addItem(product, count);
    }

    public void payForCurrentOrder() throws Exception {
        long price = currentOrder.getPrice();
        account.withdraw(price);
        currentOrder.setPayedTime(LocalDateTime.now());
        ordersHistory.add(currentOrder);
        currentOrder = new Order();
    }

    public long getRemainingMoney() {
        return account.getMoney();
    }

    @Override
    public String toString() {
        return "User{" +
                "userData=" + userData +
                ", userAddressBook=" + userAddressBook +
                ", favorites=" + favorites +
                ", ordersHistory=" + ordersHistory +
                ", account=" + account +
                ", currentOrder=" + currentOrder +
                '}';
    }
}
