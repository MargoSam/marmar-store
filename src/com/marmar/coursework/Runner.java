package com.marmar.coursework;

import com.marmar.coursework.delivery.NovaPoshta;
import com.marmar.coursework.product.Color;
import com.marmar.coursework.product.Product;
import com.marmar.coursework.product.Size;
import com.marmar.coursework.user.*;

public class Runner {
    public static void main(String[] args) {

        UserData userData = new UserData("Margo", "Stankevych", "something@gmail.com", Gender.WOMAN, "0939036445");
        System.out.println("User Data: \n" + userData);
        UserAddress userAddress1 = new UserAddress("Kyiv", "Prospect Pobedy, 45", "0939036446", new NovaPoshta());
        UserAddressBook userAddressBook = new UserAddressBook(userAddress1);

        User user = new User(userData, userAddress1);
        UserAddress userAddress2 = new UserAddress("Kyiv", "Prospect Pobedy, 95", "0939036446", new NovaPoshta());
        user.addAddress(userAddress2);
        System.out.println("User Address Book: \n" + user.getUserAddressBook());

        Product product1 = new Product("Missguided Plus Twist Front Floral Dress", Color.MULTI, Size.M, "Smooth stretch fabric\n" +
                "Soft-touch style", "Missguided", "Main: 96% Polyester, 4% Elastane.", 50);
        Product product2 = new Product("Missguided Tall Paper Waist Culottes", Color.YELLOW, Size.L, "Structured cotton\n" +
                "The kind that doesn't stretch", "Missguided", "Main: 100% Cotton.", 50);
        Product product3 = new Product("Esprit Parrot Print Tie Back Jumpsuit", Color.NAVY, Size.S, "Smooth woven fabric\n" +
                "The kind that doesn't stretch", "Esprit", "Main: 100% Viscose.", 87);
        user.addProductToFavorites(product1);
        user.addProductToFavorites(product2);
        System.out.println("Fav Items: \n" + user.getFavorites());

        user.addProductToOrder(product3);
        try {
            user.payForCurrentOrder();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Orders History: \n" + user.getOrdersHistory());
    }
}

