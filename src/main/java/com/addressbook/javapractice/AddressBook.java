package com.addressbook.javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Person> al = null;
    AddressBook(){
        al = new ArrayList<>();
    }
    public void readDataFromConsole() {
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
        String zipCode = sc.next();
        System.out.println("Enter the contact number...");
        String phoneNumber = sc.next();

        al.add( new Person(firstName, lastName, address, city, state, zipCode, phoneNumber) );
    }

    public void editPersonDetails(Person person) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Address");
        person.address = sc.next();
        System.out.println("Enter the City");
        person.city = sc.next();
        System.out.println("Enter the State");
        person.state = sc.next();
        System.out.println("Enter the ZipCode");
        person.zipCode = sc.next();
        System.out.println("Enter the contact number...");
        person.phoneNumber = sc.next();
    //    return person;

    }
    public void  deletePersonDetails(Person person) {
        return;

    }

    static void menu() {
        Person person = null;
        AddressBook ab = new AddressBook();
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur choice \n 1: Add  \n 2: Edit  \n 3: Delete \n 4: Display ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ab.readDataFromConsole();
                    break;
                case 2:
                    System.out.println("Enter the person Name to edit details..");
                    String firstName = sc.next();
                        ArrayList<Person> personlist = ab.al;
                        for(int i = 0; i < ab.al.size(); i++)
                        {
                            if (personlist.get(i).firstName.equals(firstName))
                            {
                                Person personDetail = personlist.get(i);

                                ab.editPersonDetails(personDetail);
                            } else
                            {
                                System.out.println(firstName + " is not exists ");
                            }
                        }
                    break;
                case 3:

                    System.out.println("Enter the Person name to Delete the Details");
                    String firstName1 = sc.next();
                    ArrayList<Person> personlist1 = ab.al;
                    for(int i = 0; i < ab.al.size(); i++)
                    {
                        if (personlist1.get(i).firstName.equals(firstName1))
                        {
                            personlist1.remove(i);
                            System.out.println("Deleted Successfully...");
                        }
                        else
                        {
                            System.out.println(firstName1 + " is not exists ");
                        }
                    }
                    break;

                case 4:
                    System.out.println(ab.al);
                    break;
                default:
                    System.out.println("Enter numer from 1 to 4");
            }
        } while (choice<5);
    }
    public static void main(String[] args) {

        // Person person = new Person("Sharad", "Pati;", "Nyahalod", "Dhule",
        // "Maharastra", 424002, "9096548988");
        // Person person = readDataFromConsole();

//        Person person1 = new Person("Jitendra", "Pati;", "Biladi", "Dhule",
//                // "Maharastra", 424004, "7447801398");
//                // Person person = readDataFromConsole();
        menu();
    }
}
