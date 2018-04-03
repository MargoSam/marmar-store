package com.marmar.coursework.order;

import com.marmar.coursework.product.Product;

public class OrderItem {
    private final Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        checkQuantity(quantity);

        this.product = product;
        this.quantity = quantity;
    }

    public OrderItem(Product product) {
        this(product, 1);
    }

    public long getPrice() {
        return product.getPrice() * quantity;
    }

    public void incQuantity() {
        quantity++;
    }

    public void decQuantity() {
        if (quantity == 0) {
            throw new IllegalStateException("Can't decrease zero quantity");
        }
        quantity--;
    }

    public void setQuantity(int quantity) {
        checkQuantity(quantity);
        this.quantity = quantity;
    }

    private void checkQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Illegal quantity: " + quantity);
        }
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
