public class Main {
    public static void main (String[] args){
        Address address = new Address();
        Contact contact = new Contact();
        Flight flight = new Flight();
        Passenger passenger = new Passenger();
        Ticket ticket = new Ticket();
        RegularTicket regularTicket = new RegularTicket();
        TouristTicket touristTicket = new TouristTicket();
        address.print();
        contact.print();
        flight.print();
        passenger.print();
        ticket.print();
        regularTicket.print();
        touristTicket.print();
    }

}
