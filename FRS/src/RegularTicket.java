public class RegularTicket extends Ticket {
    String ticketType;
    private String specialServices;

    // Parameterized Constructor (RegularTicket)
    public RegularTicket(String pnr, String departureLocation, String destinationLocation,
                         String dateOfDeparture, String dateOfArrival, String timeOfDeparture,
                         String timeOfArrival, String seatNumber, float ticketPrice,
                         Flight flight, Passenger passengerDetails, boolean cancel,
                         String specialServices, String ticketType) {
        super(pnr, departureLocation, destinationLocation, dateOfDeparture, dateOfArrival, timeOfDeparture, timeOfArrival, seatNumber, ticketPrice, flight, passengerDetails, cancel);
        this.specialServices = specialServices;
        this.ticketType = ticketType;
    }

    // printTicketDetails()
    public static void printTicketDetails(Ticket ticket) {
        System.out.println("Printing Ticket Details...");
        System.out.println("PNR: " + ticket.getPnr() + "\tDeparture Location: " + ticket.getDepartureLocation() + "\tArrival Location: " + ticket.getArrivalLocation());
        System.out.println("Date of Departure: " + ticket.getDateOfDeparture() + "\tDate of Arrival: " + ticket.getDateOfArrival());
        System.out.println("Time of Departure: " + ticket.getTimeOfDeparture() + "\tTime of Arrival: " + ticket.getTimeOfArrival());
        System.out.println("Seat Number: " + ticket.getSeatNumber() + "\tTicket Price: " + ticket.getTicketPrice());
        System.out.println("Flight: " + ticket.getFlight() + "\tPassenger Details: " + ticket.getPassengerDetails());
        System.out.println("Special Services: " + specialServices() + " " + updateSpecialServices());
    }

    // specialServices()
    public static String specialServices() {

        return "Free Chicken Shawarma today!";
    }

    // updateSpecialServices()
    static String updateSpecialServices() {
        return "Special Services Update: Chicken Kurma added!";
    }

    // specialServices getter and setter
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}

