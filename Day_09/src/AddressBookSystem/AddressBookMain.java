package AddressBookSystem;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();

        addressBook.addContact();

        addressBook.displayContacts();

        addressBook.editContact("Naveen");

        addressBook.displayContacts();

        addressBook.deleteContact("Naveen");

        addressBook.displayContacts();
    }
}