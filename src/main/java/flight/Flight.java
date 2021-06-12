package flight;


import plane.Plane;
import plane.PlaneType;

public class Flight {

    private PlaneType planeType;
    private Plane plane;

    public Flight( PlaneType planeType){
        this.planeType = planeType;

    }


    public PlaneType canAssignPlaneToFlightCard() {
        return this.planeType;
    }
}


