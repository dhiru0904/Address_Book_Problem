package com.addressbookproblem;

import java.util.ArrayList;
import java.util.Scanner;
    public class ContactOperations {
    static Scanner scannar = new Scanner(System.in);
    private static ArrayList<ContactPerson> contactDetails = new ArrayList<>();
    /*
    For adding contact
     */
    public void addContact()
        {
        System.out.println("Enter the contact details.............");
        System.out.println("Enter the First name:");
        String firstName= scannar.nextLine();
        System.out.println("Enter the Last name:");
        String lastName= scannar.nextLine();
        System.out.println("Enter the Address:");
        String address= scannar.nextLine();
        System.out.println("Enter the City:");
        String city= scannar.nextLine();
        System.out.println("Enter the State:");
        String state= scannar.nextLine();
        System.out.println("Enter the Zip code:");
        String zip= scannar.nextLine();
        System.out.println("Enter the Phone no:");
        String phoneNumber= scannar.nextLine();
        System.out.println("Enter the Email:");
        String email= scannar.nextLine();
        /*
        Calling Contact person class
         */
        ContactPerson details=new ContactPerson(firstName,lastName,address,city,state,zip,phoneNumber,email);
        contactDetails.add(details);
        }
     /*
     For editing contact
      */
     public boolean editContact(String Name)
        {
        int flag = 0;
        for (ContactPerson contact : contactDetails) {
        if (contact.getFirstName().equalsIgnoreCase(Name)) {
        System.out.println("Enter the detail which needs to be updated:\nChoose the option.");
        System.out.println("1. Edit First Name");
        System.out.println("2. Edit Last Name");
        System.out.println("3. Edit Address");
        System.out.println("4. Edit City");
        System.out.println("5. Edit State");
        System.out.println("6. Edit Zip");
        System.out.println("7. Edit Phone Number");
        System.out.println("8. Edit Email");
        int choice = scannar.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Enter First Name: ");
        String firstName = scannar.next();
        contact.setFirstName(firstName);
        break;
        case 2:
            System.out.println("Enter Last name: ");
        String lastName = scannar.next();
        contact.setLastName(lastName);
        break;
        case 3:
            System.out.println("Enter Address: ");
        String address = scannar.next();
        contact.setAddress(address);
        break;
        case 4:
            System.out.println("Enter City: ");
        String city = scannar.next();
        contact.setCity(city);
        break;
        case 5:
            System.out.println("Enter State: ");
        String state = scannar.next();
        contact.setState(state);
        break;
        case 6:
            System.out.println("Enter Zip Code: ");
        String zip = scannar.next();
        contact.setZip(zip);
        break;
        case 7:
            System.out.println("Enter Phone Number:");
        String phoneNumber = scannar.next();
        contact.setPhoneNumber(phoneNumber);
        break;
        case 8:
            System.out.println("Enter Email: ");
        String email = scannar.next();
        contact.setEmail(email);
        break;
        }
        flag = 1;
        break;
        }
        }
        return flag == 1;
        }
        /*
        Print the contact details
         */
   public void printContact()
        {
        ContactPerson a = new ContactPerson();
        a.printContact(contactDetails);
        }
        /*
        check if array list is empty
         */
   public boolean checkList()
        {
            if (!contactDetails.isEmpty())
            return true;
        else
            return false;
        }
}
