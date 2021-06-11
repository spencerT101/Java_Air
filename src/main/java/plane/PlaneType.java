package plane;

public enum PlaneType {

    AIRBUS_A220(109, 60.78),
    BOEING747_8(467, 442);

    private final int capacity;
    private final double maxWeightTons;

    PlaneType(int capacity, double maxWeightTons) {
        this.capacity = capacity;
        this.maxWeightTons = maxWeightTons;
    }

    public int getCapacity(){
         return this.capacity;
    }


    public double getMaxPlaneWeight() {
        return this.maxWeightTons;
    }
}


