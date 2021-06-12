package flight;


import flightcrew.pilot.Pilot;
import plane.Plane;
import plane.PlaneType;

public class Flight {

    private PlaneType planeType;
    private Plane plane;
    private Pilot pilot;


    public Flight( PlaneType planeType, Pilot pilot){
        this.planeType = planeType;
         this.pilot = pilot;

    }


    public PlaneType flightCardHasPlane() {
        return this.planeType;
    }

    public String flightCardHasPilot(Pilot pilot) {
         return pilot.getName();
    }
}


