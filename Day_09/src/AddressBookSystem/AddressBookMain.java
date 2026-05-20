package AddressBookSystem;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Contact person = new Contact();

        person.firstName = "Naveen";

        person.lastName = "Kumar";

        person.address = "Chennai";

        person.city = "Chennai";

        person.state = "Tamil Nadu";

        person.zip = "600001";

        person.phoneNumber = "9876543210";

        person.email = "naveen@gmail.com";

        person.displayContact();
    }
}