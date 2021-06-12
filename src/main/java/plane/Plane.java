package plane;

public class Plane {
    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneTypeFromEnum(){
        return this.planeType;
    }
    public  int getPlaneCapacityFromEnum(){
        return this.planeType.getCapacity();
    }

    public double getMaxPlaneWeightFromEnum() {
        return this.planeType.getMaxPlaneWeight();
    }


}
