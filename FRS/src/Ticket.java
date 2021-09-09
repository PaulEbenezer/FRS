import java.util.Scanner;

public abstract class Ticket {
    private String pnr;
    private String departureLocation;
    private String arrivalLocation;
    private String dateOfDeparture;
    private String dateOfArrival;
    private String timeOfDeparture;
    private String timeOfArrival;
    private String seatNumber;
    private float ticketPrice;
    private Flight flight;
    private Passenger passengerDetails;
    private boolean cancel;

    // Parameterized Constructor (Ticket)
    public Ticket(String pnr, String departureLocation, String arrivalLocation,
                  String dateOfDeparture, String timeOfDeparture, String dateOfArrival,
                  String timeOfArrival, String seatNumber, float ticketPrice, Flight flight, Passenger passengerDetails, boolean cancel) {
        this.pnr = pnr;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.flight = flight;
        this.passengerDetails = passengerDetails;
        this.cancel = cancel;
    }

    // printTicketDetails()
    public static void printTicketDetails(Ticket ticket) {
        System.out.println("Printing Ticket Details...");
        System.out.println("PNR: " + ticket.pnr + "\tDeparture Location: " + ticket.departureLocation + "\tArrival Location: " + ticket.arrivalLocation);
        System.out.println("Date of Departure: " + ticket.dateOfDeparture + "\tDate of Arrival: " + ticket.dateOfArrival);
        System.out.println("Time of Departure: " + ticket.timeOfDeparture + "\tTime of Arrival: " + ticket.timeOfArrival);
        System.out.println("Seat Number: " + ticket.seatNumber + "\tTicket Price: " + ticket.ticketPrice);
        System.out.println("Flight: " + ticket.flight + "\tPassenger Details: " + ticket.passengerDetails);

    }

    // pnr getter and setter
    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    // departureLocation getter and setter
    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    // arrivalLocation getter and setter
    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    // dateOfDeparture getter and setter
    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    // dateOfArrival getter and setter
    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    // timeOfDeparture getter and setter
    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    // timeOfArrival getter and setter
    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    // seatNumber getter and setter
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // ticketPrice getter and setter
    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // flight getter and setter
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    // passengerDetails getter and setter
    public Passenger getPassengerDetails() {
        return passengerDetails;
    }

    public void setPassengerDetails(Passenger passengerDetails) {
        this.passengerDetails = passengerDetails;
    }

    // cancel getter and setter
    public boolean isCancel() {
        return cancel;
    }

    //

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    // ticketCancel()
    void ticketCancel() {
        System.out.println("Do you want to cancel your ticket..? Press (y/n) to continue or go back");
        Scanner sc = new Scanner(System.in);
        String y = sc.next();
        if (y.equals("y")) {
            System.out.println("Cancelling Ticket...");
            System.out.println("Ticket Cancelled Successfully!");
        } else if (y.equals("n")) {
            System.out.println("Ticket Cancellation Aborted Successfully");
        } else {
            System.out.println("Enter a valid input");
        }

    }

    // ticketStatus()
    String ticketStatus() {
        String flight = "EK 513";
        return "Your flight number\n from: " + departureLocation + "\n to: " + arrivalLocation + "\n on: " + dateOfDeparture + " is " + flight + "\nTime of Departure: " + timeOfDeparture + "\tTime of Arrival: " + timeOfArrival;
    }
}