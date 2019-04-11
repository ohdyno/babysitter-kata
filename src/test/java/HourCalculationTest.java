import org.junit.Test;

import static org.junit.Assert.*;

public class HourCalculationTest {
    @Test
    public void getNextHour() {
        assertEquals(Hour.sixPM(), Hour.fivePM().next());
        assertEquals(Hour.sevenPM(), Hour.sixPM().next());
        assertEquals(Hour.eightPM(), Hour.sevenPM().next());
        assertEquals(Hour.ninePM(), Hour.eightPM().next());
        assertEquals(Hour.tenPM(), Hour.ninePM().next());
        assertEquals(Hour.elevenPM(), Hour.tenPM().next());
        assertEquals(Hour.twelveAM(), Hour.elevenPM().next());
        assertEquals(Hour.oneAM(), Hour.twelveAM().next());
        assertEquals(Hour.twoAM(), Hour.oneAM().next());
        assertEquals(Hour.threeAM(), Hour.twoAM().next());
        assertEquals(Hour.fourAM(), Hour.threeAM().next());
    }

    @Test
    public void cannotProceedBeyond4AM() {
        assertEquals(Hour.fourAM(), Hour.fourAM().next());
    }

    @Test
    public void isBetween() {
        assertTrue(Hour.sixPM().isBetween(Hour.fivePM(), Hour.sevenPM()));
        assertFalse(Hour.sixPM().isBetween(Hour.twelveAM(), Hour.fourAM()));
    }

    @Test
    public void isBetweenIncludeBeginningHour() {
        assertTrue(Hour.sixPM().isBetween(Hour.sixPM(), Hour.sevenPM()));
    }

    @Test
    public void isBetweenDoesNotIncludeEndingHour() {
        assertFalse(Hour.sixPM().isBetween(Hour.fivePM(), Hour.sixPM()));
    }
}
