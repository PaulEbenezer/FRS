public class TouristTicket {
    String hotelAddress;
    String[] selectedTouristLocation = new String[5];
    String getHotelAddress(){
        return "Hotel: Ares-3, Acidalia Planitia, Mars";
    }
    String getTouristLocations(){
        return "5 tourist locations using array";
    }
    void removeTouristLocation(String location){
        System.out.println("Location Removed");
    }
    void addTouristLocation(String location){
        System.out.println("Add Removed");
    }
    void print(){
        System.out.println("This is Tourist Ticket class");
    }
}
