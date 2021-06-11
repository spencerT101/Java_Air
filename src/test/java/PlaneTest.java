import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane1;
    private Plane plane2;

    @Before
    public void  setUp(){
        plane1 = new Plane (PlaneType.AIRBUS_A220);
        plane2 = new Plane (PlaneType.BOEING747_8);

    }

    @Test
    public void canGetPlaneTypeFromEnum(){
        assertEquals(PlaneType.AIRBUS_A220, plane1.getPlaneTypeFromEnum());
        System.out.println(plane1.getPlaneTypeFromEnum());
        System.out.println(plane2.getPlaneTypeFromEnum());
    }
    @Test
    public void canGetPlaneCapacityFromEnum(){
        assertEquals(109, plane1.getPlaneCapacityFromEnum());
        System.out.println(plane1.getPlaneCapacityFromEnum());
        System.out.println(plane2.getPlaneCapacityFromEnum());

    }

    @Test
    public void canGetMaxPlaneWeightFromEnum(){
        assertEquals(60.78, plane1.getMaxPlaneWeightFromEnum(), 0.00);
    }


}
