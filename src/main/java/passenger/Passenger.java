package passenger;

public class Passenger {
    private String name;
    private int numOfCheckInBags;

    public Passenger(String name, int numOfCheckInBags){
        this.name = name;
        this.numOfCheckInBags = numOfCheckInBags;
    }


    public String getPassengerName() {
        return this.name;
    }

    public int getNumOfCheckInBags() {
        return this.numOfCheckInBags;
    }
}
