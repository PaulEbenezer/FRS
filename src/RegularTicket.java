public class RegularTicket {
    String specialServices;
    String specialServices(){
        return "Chicken Shawarma today!";
    }
    void updateSpecialServices(String services){
        System.out.println("Special Services Update: Mutton Shawarma added!");
    }
    void print(){
        System.out.println("This is Regular Ticket class");
    }
}

