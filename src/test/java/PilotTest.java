import flightcrew.Rank;
import org.junit.Before;
import org.junit.Test;
import flightcrew.pilot.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    private Pilot pilot;
    private String qualified;

    @Before
    public void setUp(){
        pilot = new Pilot ("James", Rank.CAPTAIN, "J5678910");
    }

    @Test
    public void canGetPilotName(){
        assertEquals("James", pilot.getName());
        System.out.println(pilot.getName());
    }
    @Test
    public void canGetPilotRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
        System.out.println(pilot.getRank());
    }
    @Test
    public void canGetPilotLicense(){
        assertEquals("My pilot licence number is J5678910", pilot.getPilotLicence());
        System.out.println(pilot.getPilotLicence());
    }

    @Test
    public void canPilotFlyPlane(){
        qualified = "I am qualified to fly passenger aircraft!";
        assertEquals("I am qualified to fly passenger aircraft!", pilot.pilotCanFlyPlane(qualified));
        System.out.println(pilot.pilotCanFlyPlane(qualified));
    }


}
