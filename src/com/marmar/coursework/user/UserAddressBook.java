package com.marmar.coursework.user;

import java.util.ArrayList;
import java.util.List;

public class UserAddressBook {
    private final List<UserAddress> addressesList = new ArrayList<>();

    public UserAddressBook(UserAddress userAddress) {
        addressesList.add(userAddress);
    }

    public void addAddress(UserAddress userAddress) {
        addressesList.add(userAddress);
    }

    public UserAddress getAddress(int index) {
        return addressesList.get(index);
    }

    public List<UserAddress> getAddressesList() {
        return addressesList;
    }

    @Override
    public String toString() {
        return "UserAddressBook{" +
                "addressesList=" + addressesList +
                '}';
    }
}
