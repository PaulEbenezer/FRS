public class Contact {
    String name, phone, email;
    String getContact(){
        return "Contacts entered";
    }
    void updateContact(String contactDetails){
        System.out.println("Contacts Updated");
    }
    void print(){
        System.out.println("This is Contact class");
    }
}
