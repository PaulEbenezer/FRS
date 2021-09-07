public class Ticket {
    String pnr, departureLocation, destinationLocation, date_timeOfDeparture, date_timeOfArrival, seatNumber;
    float ticketPrice;
    boolean cancel;
    void cancel(){
        System.out.println("Ticket Cancelled");
    }
    String ticketStatus(){
        return "Ticket Booking Done";
    }
    int flightDuration(){
        return 60;
    }
    void print(){
        System.out.println("This is Ticket class");
    }
}
