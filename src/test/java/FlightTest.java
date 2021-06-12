import flight.Flight;
import flightcrew.Rank;
import flightcrew.cabincrew.CabinCrewMember;
import flightcrew.pilot.Pilot;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {
    private Flight flight;
    private PlaneType planeType;
    private Pilot pilot1;
    private Passenger passenger1;
    private ArrayList<Passenger> passengers;

//    private CabinCrewMember CabinCrewMember1;
//    private String departureAirport;
//    private String destinationAirport;

    @Before
    public void setUp(){
        flight = new Flight(PlaneType.AIRBUS_A220, pilot1, passengers);
        pilot1 = new Pilot("Harry", Rank.CAPTAIN,"JCD65438");
        passenger1 = new Passenger("Sally", 1);
        passengers = new ArrayList<>();


    }
    @Test
    public void flightCardCanHavePlane(){
        assertEquals(PlaneType.AIRBUS_A220, flight.flightCardHasPlane());
        System.out.println(flight.flightCardHasPlane());
    }
    @Test
    public void flightCardCanHavePilot(){
        assertEquals("Harry", flight.flightCardHasPilot(pilot1));
        System.out.println(flight.flightCardHasPilot(pilot1));
    }
    @Test
    public void flightCardHasZeroPassengers(){
        assertEquals(0, flight.getPassengerListCount());
        System.out.println(flight.getPassengerListCount());
    }
    @Test
    public void canAddPassengerToFlightCardPassengerList(){
        flight.addPassengerToFlightCard(passenger1);
        assertEquals(1, flight.getPassengerListCount());
        System.out.println(flight.getPassengerListCount());
    }
    @Test
    public void canRemovePassengerFromFlightCardPassengerList(){
        flight.addPassengerToFlightCard(passenger1);
        flight.removePassengerFromFlightCard(passenger1);
        assertEquals(0, flight.getPassengerListCount());
        System.out.println(flight.getPassengerListCount());
    }








}
