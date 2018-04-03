package com.marmar.coursework.user;

import com.marmar.coursework.order.Order;

import java.util.ArrayList;
import java.util.List;

public class UserOrdersHistory {
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        return "UserOrdersHistory{" +
                "orders=" + orders +
                '}';
    }
}
