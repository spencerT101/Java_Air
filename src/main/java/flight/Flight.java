package flight;


import flightcrew.pilot.Pilot;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private PlaneType planeType;
    private Plane plane;
    private Pilot pilot;
    private ArrayList<Passenger>passengerList;


    public Flight( PlaneType planeType, Pilot pilot, ArrayList passengerList){
        this.planeType = planeType;
         this.pilot = pilot;
         this.passengerList = new ArrayList<>();

    }


    public PlaneType flightCardHasPlane() {
        return this.planeType;
    }

    public String flightCardHasPilot(Pilot pilot) {
         return pilot.getName();
    }

    public int getPassengerListCount() {
       return this.passengerList.size();

    }

    public void addPassengerToFlightCard(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public void removePassengerFromFlightCard(Passenger passenger) {
        this.passengerList.remove(passenger);
    }
}


