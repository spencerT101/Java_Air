package flight;


import flightcrew.cabincrew.CabinCrewMember;
import flightcrew.pilot.Pilot;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private PlaneType planeType;
    private Pilot pilot;
    private ArrayList<Passenger>passengerList;
    private ArrayList<CabinCrewMember> cabinCrewList;
    private String departureAirport;
    private String destinationAirport;


    public Flight( Plane plane, Pilot pilot, ArrayList passengerList, ArrayList cabinCrewList, String departureAirport, String destinationAirport){
        this.plane = plane;
         this.pilot = pilot;
         this.passengerList = new ArrayList<>();
         this.cabinCrewList = new ArrayList<>();
         this.departureAirport = departureAirport;
         this.destinationAirport = destinationAirport;

    }


    public PlaneType flightCardHasPlane(Plane plane) {
        return plane.getPlaneTypeFromEnum();
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

    public int cabinCrewListCount() {
        return this.cabinCrewList.size();
    }

    public void addCabinCrewMemberToFlightCard(CabinCrewMember cabinCrewMember) {
        this.cabinCrewList.add(cabinCrewMember);
    }

    public void removeCabinCrewMemberFromFlightCard(CabinCrewMember cabinCrewMember) {
        this.cabinCrewList.remove(cabinCrewMember);
    }

    public String getFlightCardDepartureAirport() {
        return this.departureAirport;
    }

    public String getFlightCardDestinationAirport() {
        return this.destinationAirport;
    }
}


