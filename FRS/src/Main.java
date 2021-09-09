import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Passenger passengerObject = new Passenger("Hawkins Lab North Main Street", "Hawkins", "Indiana", "Steve Harrington", "(760)852-8037", "steveharrington01@yahoo.com");

        Flight flightObject = new Flight("EK 513", "Emirates", 138, 137);

        RegularTicket regularTicketObject = new RegularTicket("US 0632", "HAWKINS (HAW), TERMINAL 5", "LONDON (LYC), TERMINAL 3", "30 SEPT 21", "30 SEPT 21", "5:30", "12:00", "C14", 34500.0f, flightObject, passengerObject, false, "Free Chicken Shawarma served today!", "General Admission");

        TouristTicket touristTicketObject = new TouristTicket("US 1210", "NEW JERSEY (EWR), TERMINAL 9", "LONDON (LYC), TERMINAL 2", "30 SEPT 21", "30 SEPT 21", "6:30", "14:30", "A19", 33725.0f, flightObject, passengerObject, true, "Strand Continental, Westminster Borough, London");


        int a;
        System.out.println("\n\nWelcome to Flight Reservation System!");
        System.out.println("For Registration press 1\nFor Passenger Details press 2\nFor Ticket Booking and other flight details press 3\n");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        switch (a) {
            case 1:
                System.out.println("Registration Portal:");
                passengerObject.registration();
                System.out.println("Registration Successful!");
                break;
            case 2:
                System.out.println("Passenger Details:");
                System.out.println("For viewing Passenger Details press 1\nFor updating Passenger details press 2\n");
                int b;
                b = scan.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("\nDetails of the Passenger\n");
                        System.out.println(passengerObject.getContact());
                        System.out.println(passengerObject.getAddress());
                        break;
                    case 2:
                        passengerObject.updateContact("Contact Details Updation");
                        passengerObject.updateAddress("Address Details Updation");
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + b);
                }

            case 3:
                System.out.println("Flight and Ticket Booking Details");
                System.out.println("For booking tickets press 1\nFor Flight Details press 2\nFor Ticket Status press 3\nFor viewing the ticket press 4\nFor ticket cancellation press 5\nFor checking seats availability press 6");
                int c;
                c = scan.nextInt();
                switch (c) {
                    case 1:
                        passengerObject.registration();
                        System.out.println("Book a flight");
                        System.out.println("1. Emirates, 2. Air India, 3. British Airways, 4. Lufthansa");
                        int fly;
                        fly = scan.nextInt();
                        switch (fly) {
                            case 1:
                                System.out.println("Ticket booked ---> Airlines: Emirates\nHappy Journey!");
                                break;
                            case 2:
                                System.out.println("Ticket booked ---> Airlines: Air India\nHappy Journey");
                                break;
                            case 3:
                                System.out.println("Ticket booked ---> Airlines: British Airways\nHappy Journey");
                                break;
                            case 4:
                                System.out.println("Ticket booked ---> Airlines: Lufthansa\nHappy Journey");
                                break;
                            default:
                                System.out.println("Illegal Input");
                                break;
                        }
                    case 2:
                        System.out.println("Flight Details:");
                        System.out.println(flightObject.flightDetails());
                        break;
                    case 3:
                        System.out.println("Ticket Status:");
                        System.out.println("If your ticket is a regular ticket press 1\nIf your ticket is a Tourist ticket press 2");
                        int d;
                        d = scan.nextInt();
                        switch (d) {
                            case 1:
                                System.out.println("Regular Ticket Status");
                                System.out.println(regularTicketObject.ticketStatus());
                                break;
                            case 2:
                                System.out.println("Tourist Ticket");
                                System.out.println(touristTicketObject.ticketStatus());
                                break;
                            default:
                                System.out.println("Illegal Input");
                                break;
                        }
                    case 4:
                        System.out.println("View Ticket");
                        int e;
                        e = scan.nextInt();
                        System.out.println("If your ticket is a regular ticket press 1\nIf your ticket is a Tourist ticket press 2");
                        switch (e) {
                            case 1:
                                System.out.println("View Regular Ticket");
                                regularTicketObject.printTicketDetails(regularTicketObject);
                                break;
                            case 2:
                                System.out.println("View Tourist Ticket");
                                touristTicketObject.printTicketDetails(touristTicketObject);
                                break;
                            default:
                                System.out.println("Illegal Input");
                                break;
                        }
                    case 5:
                        System.out.println("Ticket Cancellation:");
                        System.out.println("If your ticket is a regular ticket press 1 to cancel\nIf your ticket is a Tourist ticket press 2 to cancel");
                        int f;
                        f = scan.nextInt();
                        switch (f) {
                            case 1:
                                System.out.println("Cancelling Regular Ticket");
                                regularTicketObject.ticketCancel();
                                break;
                            case 2:
                                System.out.println("Cancelling Tourist Ticket");
                                touristTicketObject.ticketCancel();
                                System.exit(0);
                            default:
                                System.out.println("Illegal Input");
                                break;
                        }
                    case 6:
                        System.out.println("Checking if seats are available...");
                        flightObject.seatAvailability();
                        break;
                    default:
                        System.out.println("Illegal Input");
                        break;
                }
            default:
                System.out.println("Illegal Input");
                break;

        }

    }
}
