import flightcrew.Rank;
import flightcrew.cabincrew.CabinCrewMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember flyAttendant;

    @Before
    public void setUp(){
        flyAttendant = new CabinCrewMember("Harry", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetCabinCrewMemberName(){
        assertEquals("Harry", flyAttendant.getName());
        System.out.println(flyAttendant.getName());
    }
    @Test
    public void canGetCabinCrewMemberRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, flyAttendant.getRank());
        System.out.println(flyAttendant.getRank());
    }
}
