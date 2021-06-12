import flight.Flight;
import flightcrew.Rank;
import flightcrew.cabincrew.CabinCrewMember;
import flightcrew.pilot.Pilot;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private PlaneType planeType;
    private Pilot pilot1;
//    private Passenger passenger1;
//    private CabinCrewMember CabinCrewMember1;
//    private String departureAirport;
//    private String destinationAirport;

    @Before
    public void setUp(){
        flight = new Flight(PlaneType.AIRBUS_A220, pilot1);
        pilot1 = new Pilot("Harry", Rank.CAPTAIN,"JCD65438")

    }
    @Test
    public void canAssignPlaneToFlightCard(){
        assertEquals(PlaneType.AIRBUS_A220, flight.canAssignPlaneToFlightCard());
        System.out.println(flight.canAssignPlaneToFlightCard());
    }







}
