import java.util.Scanner;

public class Passenger {
    private static int idCounter;

    // static block
    static {
        idCounter = 0;
    }

    private int id;
    private Contact contact;
    private Address address;

    // parameterized constructor (Passenger)
    public Passenger(String addressStreet, String addressCity,
                     String addressState, String contactName, String contactPhone,
                     String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);

    }

    // id getter and setter
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // idCounter getter and setter
    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    int getPassengerCount() {
        return idCounter;
    }

    // getContact()
    String getContact() {
        return "Name: " + contact.name + "\nPhone Number: " + contact.phone + "\n" + "E-mail: " + contact.email + "\n";
    }

    // updateContact()
    void updateContact(String contactDetails) {
        String userInputName, userInputPhone, userInputEmail;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Name to update");
        userInputName = scan.next();
        System.out.println("Name updated... \nPlease enter Phone Number to update");
        userInputPhone = scan.next();
        System.out.println("Phone Number updated... \nPlease enter E-mail to update");
        userInputEmail = scan.next();
        System.out.println("E-mail updated...");
        System.out.println("The updated contact details are:\nName: " + userInputName + "\nPhone Number: " + userInputPhone + "\nE-mail: " + userInputEmail + "\n");
    }


    // <Methods of Contact>

    // getAddress()
    public String getAddress() {
        return "Street: " + address.street + "\nCity: " + address.city + "\nState: " + address.state + "\n";
    }

    // updateAddress()
    void updateAddress(String addressDetails) {
        String userInputStreet, userInputCity, userInputState;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Street address to update");
        userInputStreet = scan.next();
        System.out.println("Street address updated...\nPlease enter City address to update ");
        userInputCity = scan.next();
        System.out.println("City address updated...\nPlease enter State address to update ");
        userInputState = scan.next();
        System.out.println("\nState address updated...");
        System.out.println("The updated address details are:\nStreet: " + userInputStreet + "\nCity: " + userInputCity + "\nState: " + userInputState);
    }

    // <Methods of Address>

    // registration()
    void registration() {
        String userInputName, userInputGender, userInputPhone, userInputEmail, userInputStreet, userInputCity, userInputState;
        int userInputAge;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Name: ");
        userInputName = scan.next();
        System.out.println("Please enter Gender: ");
        userInputGender = scan.next();
        System.out.println("Please enter age: ");
        userInputAge = scan.nextInt();
        System.out.println("Please enter Phone Number: ");
        userInputPhone = scan.next();
        System.out.println("Please enter E-mail: ");
        userInputEmail = scan.next();
        System.out.println("The contact details are:\nName: " + userInputName + "\nPhone Number: " + userInputPhone + "\nE-mail: " + userInputEmail);

        System.out.println("Please enter Street address: ");
        userInputStreet = scan.next();
        System.out.println("Please enter City address: ");
        userInputCity = scan.next();
        System.out.println("Please enter State address: ");
        userInputState = scan.next();
        System.out.println("The address details of " + userInputName + " are:\nStreet: " + userInputStreet + "\nCity: " + userInputCity + "\nState: " + userInputState);

    }

    // *** Contact Class ***
    private static class Contact {
        String name;
        String phone;
        String email;

        // Parameterized constructor (Contact class)
        public Contact(String contactName, String contactPhone, String contactEmail) {
            this.name = contactName;
            this.phone = contactPhone;
            this.email = contactEmail;
        }
    }

    // *** Address Class ***
    private static class Address {
        String street;
        String city;
        String state;

        // Parameterized Constructor (Address Class)
        public Address(String streetName, String cityName, String stateName) {
            this.state = stateName;
            this.city = cityName;
            this.street = streetName;
        }

    }

}
