package passenger;

public class Passenger {
    private String name;
    private int numOfBags;

    public Passenger(String name, int numOfBags){
        this.name = name;
        this.numOfBags = numOfBags;
    }


    public String getPassengerName() {
        return this.name;
    }
}
