package com.marmar.coursework.user;

import com.marmar.coursework.delivery.Delivery;
import com.marmar.coursework.delivery.Pickup;

public class UserAddress {
    private final String city;
    private final String address;
    private final String phoneNumber;
    private Delivery delivery;

    public UserAddress(String city, String address, String phoneNumber) {
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
      //  delivery = new Pickup();
    }

    public UserAddress(String city, String address, String phoneNumber, Delivery delivery) {
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.delivery = delivery;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", delivery=" + delivery +
                '}';
    }
}
