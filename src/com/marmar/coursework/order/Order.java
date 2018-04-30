package com.marmar.coursework.order;

import com.marmar.coursework.product.Product;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String id = UUID.randomUUID().toString();
    private final List<OrderItem> items = new ArrayList<>();
    private final LocalDateTime createdTime = LocalDateTime.now();
    private LocalDateTime payedTime;
    private OrderStatus orderStatus = OrderStatus.ASSEMBLING;

    public long getPrice() {
        long price = 0;
        for (OrderItem item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public void setPayedTime(LocalDateTime payedTime) {
        this.payedTime = payedTime;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getPayedTime() {
        return payedTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", items=" + items +
                ", createdTime=" + createdTime +
                ", payedTime=" + payedTime +
                '}';
    }
}
