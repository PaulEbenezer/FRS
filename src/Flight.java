public class Flight {
    String flightNum, flightAirline;
    int flightCapacity;
    private int seatsBooked;
    String flightDetails(){
        return "Flight Details";
    }
    boolean seatAvailability(){
        return true;
    }
    void updateBookingCounter(){
       System.out.println("Booking Counter Updated");
    }
    void print(){
        System.out.println("This is Flight class");
    }
}
