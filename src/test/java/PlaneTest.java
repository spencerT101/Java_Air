import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane1;

    @Before
    public void  setUp(){
        plane1 = new Plane (PlaneType.AIRBUSA220);

    }

    @Test
    public void canGetPlaneTypeFromEnum(){
        assertEquals(PlaneType.AIRBUSA220, plane1.getPlaneTypeFromEnum());
    }
    public void canGetPlaneCapacityFromEnum(){
        assertEquals(PlaneType.AIRBUSA220.getPlaneCapacityFromEnum());
    }


}
