import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger1;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Sally", 1);

    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Sally", passenger1.getPassengerName());
        System.out.println(passenger1.getPassengerName());
    }
    @Test
    public void canGetNumOfCheckInBags(){
        assertEquals(1, passenger1.getNumOfCheckInBags());
    }
}
