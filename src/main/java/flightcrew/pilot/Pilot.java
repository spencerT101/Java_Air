package flightcrew.pilot;

import flightcrew.FlightCrewMember;
import flightcrew.Rank;

public class Pilot extends FlightCrewMember {
    private String name;
    private Rank rank;
    private String pilotLicence;

    public Pilot(String name, Rank rank, String pilotLicence){
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return "My pilot licence number is " + this.pilotLicence;
    }
    public String pilotCanFlyPlane(String qualified){
        return qualified;
    }

}
