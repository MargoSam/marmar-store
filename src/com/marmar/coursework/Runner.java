package com.marmar.coursework;

import com.marmar.coursework.delivery.NovaPoshta;
import com.marmar.coursework.product.*;
import com.marmar.coursework.user.*;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        UserData userData = new UserData("Margo", "Stankevych", "something@gmail.com", Gender.WOMAN, "0939036445");
        System.out.println("User Data: \n" + userData);
        System.out.println();
        UserAddress userAddress1 = new UserAddress("Kyiv", "Prospect Pobedy, 45", "0939036446", new NovaPoshta());
        UserAddressBook userAddressBook = new UserAddressBook(userAddress1);

        User user = new User(userData, userAddress1);
        UserAddress userAddress2 = new UserAddress("Kyiv", "Prospect Pobedy, 95", "0939036446", new NovaPoshta());
        user.addAddress(userAddress2);
        System.out.println("User Address Book: \n" + user.getUserAddressBook());
        System.out.println();

        Product product1 = new Product("Missguided Plus Twist Front Floral Dress", Color.MULTI, Size.M, "Smooth stretch fabric\n" +
                "Soft-touch style", "Missguided", "Main: 96% Polyester, 4% Elastane.", 50);
        Product product2 = new Product("Missguided Tall Paper Waist Culottes", Color.YELLOW, Size.L, "Structured cotton\n" +
                "The kind that doesn't stretch", "Missguided", "Main: 100% Cotton.", 60);
        Product product3 = new Product("Esprit Parrot Print Tie Back Jumpsuit", Color.NAVY, Size.S, "Smooth woven fabric\n",
                "Esprit", "Main: 100% Viscose.", 87);
        Product product4 = new Product("Y.A.S Ruffle Stripe Dress With Cold Shoulder", Color.PINK, Size.S, "Lightweight woven fabric\n",
                "Y.A.S.", "Body: 80% Cotton, 18% Nylon, 2% Elastane.", 102);
        Product product5 = new Product("ASOS DESIGN jumpsuit with twist front in floral tile print", Color.MULTI, Size.L,
                "Super-smooth, silky-silky feel", "ASOS DESIGN", "Main: 100% Polyester.", 102);
        user.addProductToFavorites(product1);
        user.addProductToFavorites(product2);
        System.out.println("Fav Items: \n" + user.getFavorites());
        System.out.println();

        user.addProductToOrder(product3);
        try {
            user.payForCurrentOrder();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Orders History: \n" + user.getOrdersHistory());
        System.out.println();

        Products productsList = new Products(Arrays.asList(product1, product2, product3, product4, product5));

        productsList.sort(new ProductNameComparator());
        System.out.println("Sorting by the Name, ascending order: " + productsList);
        System.out.println();
        productsList.sortReversed(new ProductNameComparator());
        System.out.println("Sorting by the Name, descending order: " + productsList);
        System.out.println();
        productsList.sort(new ProductPriceComparator());
        System.out.println("Sorting by the Price, ascending order: " + productsList);
        System.out.println();
        productsList.sort(new ProductPriceComparator(), new ProductNameComparator());
        System.out.println("Sorting by the Price and then by Name: " + productsList);
        System.out.println();
    }
}

