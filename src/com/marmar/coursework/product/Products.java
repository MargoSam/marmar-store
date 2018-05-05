package com.marmar.coursework.product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Products {

    private final List<Product> productsList;

    public Products(List<Product> productsList) {
        this.productsList = productsList;
    }

    public void sort(Comparator<Product> comparator) {
        Collections.sort(productsList, comparator);
    }

    public void sort(Comparator<Product> comparator1, Comparator<Product> comparator2) {
        Collections.sort(productsList, comparator1.thenComparing(comparator2));
    }

    public void sortReversed(Comparator<Product> comparator) {
        Collections.sort(productsList, comparator.reversed());
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("\nProducts: ")
                .append(productsList).toString();
    }
}
