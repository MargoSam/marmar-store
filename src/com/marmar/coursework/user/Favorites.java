package com.marmar.coursework.user;

import com.marmar.coursework.order.Order;
import com.marmar.coursework.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Favorites {

    private final List<FavoriteItem> favorites = new ArrayList<>();

    public void addToFavorites(Product product) {
        favorites.add(new FavoriteItem(product));
    }

    public void addToOrder(List<FavoriteItem> favorites) {
        Order order = new Order(); //not sure if order should be created here
        for (FavoriteItem item : favorites) {
            order.addItem(item.getProduct(), 1);
        }
    }

    public void addToOrder (FavoriteItem favorite) {
        Order order = new Order();
        order.addItem(favorite.getProduct(), 1);
    }

    public List<FavoriteItem> getFavorites() {
        return favorites;
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "favorites=" + favorites +
                '}';
    }
}
