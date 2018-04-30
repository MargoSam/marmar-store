package com.marmar.coursework.user;

import com.marmar.coursework.Account;
import com.marmar.coursework.order.Order;
import com.marmar.coursework.product.Product;
import java.time.LocalDateTime;

public class User {
    private final UserData userData;
    private final UserAddressBook userAddressBook;
    private final Favorites favorites = new Favorites();
    private final UserOrdersHistory ordersHistory = new UserOrdersHistory();
    private Account account = new Account(1000);
    private Order currentOrder = new Order();

    public User(UserData userData, UserAddress userAddress) {
        this.userData = userData;
        this.userAddressBook = new UserAddressBook(userAddress);
    }

    public void addAddress(UserAddress userAddress) {
        this.userAddressBook.addAddress(userAddress);
    }

    public void addProductToOrder(Product product, int count) {
        this.currentOrder.addItem(product, count);
    }

    public void addProductToOrder(Product product) {
        this.currentOrder.addItem(product, 1);
    }

    public void addProductToFavorites(Product product) {
        this.favorites.addItem(product);
    }

    public void payForCurrentOrder() throws Exception {
        long price = currentOrder.getPrice();
        account.withdraw(price);
        currentOrder.setPayedTime(LocalDateTime.now());
        ordersHistory.add(currentOrder);
        currentOrder = new Order();
    }

    public UserData getUserData() {
        return userData;
    }

    public UserAddressBook getUserAddressBook() {
        return userAddressBook;
    }

    public Favorites getFavorites() {
        return favorites;
    }

    public UserOrdersHistory getOrdersHistory() {
        return ordersHistory;
    }

    public Account getAccount() {
        return account;
    }

    public Order getCurrentOrder() {
        return currentOrder;
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
