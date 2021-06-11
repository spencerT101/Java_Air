package flightcrew.cabincrew;

import flightcrew.FlightCrewMember;
import flightcrew.Rank;

public class CabinCrewMember extends FlightCrewMember {
    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        super(name, rank);
    }
}
