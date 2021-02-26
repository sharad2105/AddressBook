package com.addressbook.javapractice;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String phoneNumber;

    AddressBook(String firstName, String lastName, String address, String city, String state, int zipCode,String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args)
    {
        AddressBook ab = new AddressBook("Sharad","Patil","Nyahalod","Dhule","Maharastra",424002,"9096549959")
    }
}}
