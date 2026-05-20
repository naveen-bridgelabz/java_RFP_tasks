package AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addContact() {

        Contact person = new Contact();

        System.out.print("Enter First Name: ");
        person.firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        person.lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        person.address = scanner.nextLine();

        System.out.print("Enter City: ");
        person.city = scanner.nextLine();

        System.out.print("Enter State: ");
        person.state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        person.zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        person.phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        person.email = scanner.nextLine();

        contacts.add(person);

        System.out.println("Contact Added Successfully");
    }

    public void displayContacts() {

        for (Contact person : contacts) {

            person.displayContact();
        }
    }
}