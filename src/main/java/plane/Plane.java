package plane;

public class Plane {
    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneTypeFromEnum(){
        return this.planeType;
    }

}
