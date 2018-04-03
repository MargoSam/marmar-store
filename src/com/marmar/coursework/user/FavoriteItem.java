package com.marmar.coursework.user;

import com.marmar.coursework.order.OrderItem;
import com.marmar.coursework.product.Product;

public class FavoriteItem {
    private final Product product;

    public FavoriteItem(Product product) {
        this.product = product;
    }

    public void addToOrder() {
        OrderItem orderItem = new OrderItem(product, 1);
    }

    public Product getProduct() {
        return product;
    }

    public String getId() {
        return product.getId();
    }

    public String getName() {
        return product.getName();
    }

    public long getPrice() {
        return product.getPrice();
    }

    @Override
    public String toString() {
        return "FavoriteItem{" +
                "product=" + product +
                '}';
    }
}
