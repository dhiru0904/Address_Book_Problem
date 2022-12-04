package com.addressbookproblem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ContactOperations {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<ContactPerson> contactDetails = new ArrayList<>();
    /*
    Constructor
     */
    public ContactOperations() {
        this.contactDetails = new ArrayList<>();
    }
    /*
    For adding contact
     */
    public void addContact()
    {
        System.out.println("Enter the contact details.............");
        System.out.println("Enter the First name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the Last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter the Address:");
        String address = scanner.nextLine();
        System.out.println("Enter the City:");
        String city = scanner.nextLine();
        System.out.println("Enter the State:");
        String state = scanner.nextLine();
        System.out.println("Enter the Zip code:");
        String zip = scanner.nextLine();
        System.out.println("Enter the Phone no:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the Email:");
        String email = scanner.nextLine();
        /*
        Calling Contact person class
         */
        ContactPerson details = new ContactPerson(firstName, lastName, address, city, state,zip,phoneNumber,email);
        contactDetails.add(details);
    }
    /*
    Adding some contact cards
     */
    public void sharedContactCards()
    {
        ContactPerson a = new ContactPerson("dhiraj", "deore", "Indave", "Dhule",
                "Maharastra", "425408", "7709684431", "dhirajdevre@gmail.com");
        ContactPerson b = new ContactPerson("kishor", "deore", "" + "Indave", "Dhule",
                "Maharastra", "425408", "7709044435", "kishordeore11@gmail.com");
        ContactPerson c = new ContactPerson("pushkar", "deore", "Indave", "Dhule",
                "Maharastra", "425408", "9937876499", "pushkar50@gmail.com");
        contactDetails.add(a);
        contactDetails.add(b);
        contactDetails.add(c);
    }
    /*
    For editing contact
     */
    public boolean editContact()
    {
        int flag = 0;
        if (checkList())
        {
            System.out.println("Enter the Person First name to edit details: ");
            String name = scanner.next();
            for (ContactPerson contact : contactDetails) {
                if (contact.getFirstName().equalsIgnoreCase(name)) {
                    System.out.println("Enter the detail which needs to be updated:\nChoose the option.");
                    System.out.println("1. Edit First Name");
                    System.out.println("2. Edit Last Name");
                    System.out.println("3. Edit Address");
                    System.out.println("4. Edit City");
                    System.out.println("5. Edit State");
                    System.out.println("6. Edit Zip");
                    System.out.println("7. Edit Phone Number");
                    System.out.println("8. Edit Email");
                    int choice = scanner.nextInt();
                     switch (choice) {
                            case 1:
                            System.out.println("Enter First Name: ");
                            String firstName = scanner.next();
                            contact.setFirstName(firstName);
                            break;
                            case 2:
                            System.out.println("Enter Last name: ");
                            String lastName = scanner.next();
                            contact.setLastName(lastName);
                            break;
                            case 3:
                            System.out.println("Enter Address: ");
                            String address = scanner.next();
                            contact.setAddress(address);
                            break;
                            case 4:
                            System.out.println("Enter City: ");
                            String city = scanner.next();
                            contact.setCity(city);
                            break;
                            case 5:
                            System.out.println("Enter State: ");
                            String state = scanner.next();
                            contact.setState(state);
                            break;
                            case 6:
                            System.out.println("Enter Zip Code: ");
                            String zip = scanner.next();
                            contact.setZip(zip);
                            break;
                            case 7:
                            System.out.println("Enter Phone Number:");
                            String phoneNumber = scanner.next();
                            contact.setPhoneNumber(phoneNumber);
                            break;
                            case 8:
                            System.out.println("Enter Email: ");
                            String email = scanner.next();
                            contact.setEmail(email);
                            break;
                    }
                    flag = 1;
                    break;
                }
            }
        }
        return flag == 1;
    }
    /*
    For deleting contact
     */
    public boolean deleteContact() {
        int flag = 0;
        if (checkList())
        {
            System.out.println("Enter the Contact to be deleted:");
            String name = scanner.next();
            for (ContactPerson contact : contactDetails) {
                if (contact.getFirstName().equalsIgnoreCase(name)) {
                    contactDetails.remove(contact);
                    flag = 1;
                    break;
                }
            }
        }
        return flag == 1;
    }
    /*
    Check if array list is empty
     */
    public boolean checkList()
    {
        if (!contactDetails.isEmpty())
            return true;
        else
            return false;
    }
    /*
    Printing contactDetails
     */
        public void printContact() {
        if(checkList())
        {
            System.out.println("Contact details are below.....\n");
            Iterator it = contactDetails.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        else
            System.out.println("Contact list is empty.");
    }
    /*
    Creating a To string method
     */
    @Override
    public String toString() {
           return "ContactOperations{" +
                "contactDetails=" + contactDetails +
                '}';
}}