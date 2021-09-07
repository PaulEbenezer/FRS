public class Passenger {
    private int id, idCounter;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    void print(){
        System.out.println("This is Passenger class");
    }
}
