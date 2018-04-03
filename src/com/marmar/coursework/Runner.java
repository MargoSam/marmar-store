package com.marmar.coursework;

import com.marmar.coursework.delivery.NovaPoshta;
import com.marmar.coursework.user.Gender;
import com.marmar.coursework.user.UserAddress;
import com.marmar.coursework.user.UserAddressBook;
import com.marmar.coursework.user.UserData;

public class Runner {
    public static void main(String[] args) {
        UserData userData = new UserData("Margo", "Stankevych", "something@gmail.com", Gender.WOMAN, "0939036445");
        System.out.println(userData);
        UserAddress userAddress = new UserAddress("Kyiv", "Prospect Pobedy, 45", "0939036446", new NovaPoshta());
        UserAddressBook userAddressBook = new UserAddressBook(userAddress);

    }
}

