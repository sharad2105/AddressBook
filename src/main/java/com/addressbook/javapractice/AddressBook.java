package com.addressbook.javapractice;

import java.util.Scanner;

public class AddressBook {
    static Person readDataFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details of Person");
        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the Last name");
        String lastName = sc.next();
        System.out.println("Enter the Address");
        String address = sc.next();
        System.out.println("Enter the City");
        String city = sc.next();
        System.out.println("Enter the State");
        String state = sc.next();
        System.out.println("Enter the ZipCode");
        int zipCode = sc.nextInt();
        System.out.println("Enter the contact number...");
        String phoneNumber = sc.next();

        return new Person(firstName, lastName, address, city, state, zipCode, phoneNumber);
    }
    static void menu() {
        Person person = null;
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur choice press 1 For Add person press 2 For Edit person 3 For the Delete 4 For Display ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    person = readDataFromConsole();
                    break;
                default:
                    System.out.println("Enter numer from 1 to 1");
            }
        } while (choice<1);
    }
    public static void main(String[] args) {
        Person person = readDataFromConsole();
        menu();
    }
}
