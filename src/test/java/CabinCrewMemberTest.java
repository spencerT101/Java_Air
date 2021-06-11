import flightcrew.Rank;
import flightcrew.cabincrew.CabinCrewMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember FlyAttendant;

    @Before
    public void setUp(){
        FlyAttendant = new CabinCrewMember("Harry", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetCabinCrewMemberName(){
        assertEquals("Harry", FlyAttendant.getName())
    }
}
