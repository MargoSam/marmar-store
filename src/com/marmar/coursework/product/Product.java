package com.marmar.coursework.product;

import java.util.UUID;

public class Product {

    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final Color color;
    private final Size size;
    private final String description;
    private final String label;
    private final String consistOf;
    private final int price;

    public Product(String name, Color color, Size size, String description, String label, String consistOf, int price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.description = description;
        this.label = label;
        this.consistOf = consistOf;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }

    public String getConsistOf() {
        return consistOf;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("\nProduct: ")
                .append("\nID:\t")
                .append(id)
                .append("\nName:\t")
                .append(name)
                .append("\nPrice:\t")
                .append(price).toString();
    }
}
