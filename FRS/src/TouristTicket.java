import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TouristTicket extends Ticket {
    static Scanner in = new Scanner(System.in);
    static List<String> list = new ArrayList<String>();
    private String hotelAddress;
    private List<String> addLoc;
    private List<String> removeloc;

    // parameterized constructor (TouristTicket)
    TouristTicket(String pnr, String departureLocation, String destinationLocation, String dateOfDeparture, String dateOfArrival, String timeOfDeparture, String timeOfArrival, String seatNumber, float ticketPrice, Flight flight, Passenger passengerDetails, boolean cancel, String hotelAddress) {
        super(pnr, departureLocation, destinationLocation, dateOfDeparture, dateOfArrival, timeOfDeparture, timeOfArrival, seatNumber, ticketPrice, flight, passengerDetails, cancel);
        this.hotelAddress = hotelAddress;
    }

    static List<String> getTouristLocations() {
        String a;
        System.out.println("Enter 5 tourist locations");
        a = in.next();
        list.add(a);
        a = in.next();
        list.add(a);
        a = in.next();
        list.add(a);
        a = in.next();
        list.add(a);
        a = in.next();
        list.add(a);
        return list;
    }

    static List<String> removeTouristLocation(List<String> Location) {
        String a;
        System.out.println("Do you want to remove from any location from above list? Press(y/n)");
        String b = in.next();

        if (Objects.equals(b, "y") || b.equals("Y")) {
            System.out.println("Enter the location which you want to remove");
            a = in.next();
            Location.remove(new String(a));
        }
        return Location;
    }

    static List<String> addTouristLocation(List<String> Location) {
        String a;
        System.out.println("Do you want to add any location from above list? Press(y/n)");
        String b = in.next();
        if (Objects.equals(b, "y") || Objects.equals(b, "Y")) {
            System.out.println("Enter the location to add");
            a = in.next();
            Location.add(new String(a));
        }
        return Location;
    }

    public static void printTicketDetails(Ticket ticket) {
        List<String> output = TouristTicket.getTouristLocations();
        TouristTicket.removeTouristLocation(output);
        TouristTicket.addTouristLocation(output);

        System.out.println("Printing Ticket Details...");
        System.out.println("PNR: " + ticket.getPnr() + "\tDeparture Location: " + ticket.getDepartureLocation() + "\tArrival Location: " + ticket.getArrivalLocation());
        System.out.println("Date of Departure: " + ticket.getDateOfDeparture() + "\tDate of Arrival: " + ticket.getDateOfArrival());
        System.out.println("Time of Departure: " + ticket.getTimeOfDeparture() + "\tTime of Arrival: " + ticket.getTimeOfArrival());
        System.out.println("Seat Number: " + ticket.getSeatNumber() + "\tTicket Price: " + ticket.getTicketPrice());
        System.out.println("Flight: " + ticket.getFlight() + "\tPassenger Details: " + ticket.getPassengerDetails());
        System.out.println("The Tourist Locations you selected are: " + list);

    }

    // hotelAddress getter and setter
    String getHotelAddress() {
        return "Hotel: Ares-3, Acidalia Planitia, Mars";
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    // selectedTouristLocation getter and setter
    public List<String> getAddTouristLocation() {
        return addTouristLocation(getTouristLocations());
    }

    public void setAddTouristLocation(List<String> setAddTouristLocation) {
        this.addLoc = addTouristLocation(getTouristLocations());
    }

    public List<String> getRemoveTouristLocation() {
        return removeTouristLocation(getTouristLocations());
    }

    public void setRemoveTouristLocation(List<String> removeTouristLocation) {
        this.removeloc = removeTouristLocation;
    }
}
