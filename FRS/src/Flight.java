import java.util.Scanner;

public class Flight {
    private static int seatCounter;

    // static block
    static {
        seatCounter = 0;
    }

    private String flightNum;
    private String flightAirline;
    private int flightCapacity;
    private int seatsBooked;

    // Parameterized Constructor (Flight)
    public Flight(String flightNum, String flightAirline, int flightCapacity, int seatsBooked) {
        setFlightNum(flightNum);
        setFlightAirline(flightAirline);
        setFlightCapacity(flightCapacity);
        setSeatsBooked(seatsBooked);
        this.seatCounter = seatCounter;
    }

    // flightNum getter and setter
    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    // flightAirline getter and setter
    public String getFlightAirline() {
        return flightAirline;
    }

    public void setFlightAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    // flightCapacity getter and setter
    public int getFlightCapacity() {
        return flightCapacity;
    }

    public void setFlightCapacity(int flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    // seatsBooked getter and setter
    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    // seatCounter getter and setter
    public int getSeatCounter() {
        return seatCounter;
    }

    public void setSeatCounter(int seatCounter) {
        this.seatCounter = seatCounter;
    }

    // Methods of Flight Class

    // flightDetails()
    String flightDetails() {
        System.out.println("Your flight number is: " + getFlightNum());
        System.out.println("Your flight airline is: " + getFlightAirline());
        return "Thank you for choosing " + getFlightAirline() + "!";
    }

    // seatAvailability()
    boolean seatAvailability() {
        boolean flag;
        if ((flightCapacity - seatsBooked) <= 0) {
            System.out.println("No seats available");
            flag = false;
            return flag;
        } else if (flightCapacity - seatsBooked != 0) {
            System.out.println("Seat(s) available!");
            flag = true;
            return flag;
        } else {
            flag = false;
            return flag;
        }
    }

    // updateBookingCounter()
    void updateBookingCounter() {
        seatCounter = ++seatCounter;
        System.out.println(seatCounter);
        System.out.println("Booking Counter Updated");
    }

}
