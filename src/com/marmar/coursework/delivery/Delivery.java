package com.marmar.coursework.delivery;

import com.marmar.coursework.order.Order;
import com.marmar.coursework.user.UserAddress;

public interface Delivery {
    void deliver (Order order, UserAddress userAddress);
}
