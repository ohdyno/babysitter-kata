import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyARateTest {

    private final Family family = Family.A();

    @Test
    public void before11AM_eachHourIs15Dollars() {
        int expectedCost = 15;
        assertEquals(expectedCost, family.costOf(Hour.fivePM()));
        assertEquals(expectedCost, family.costOf(Hour.sixPM()));
        assertEquals(expectedCost, family.costOf(Hour.sevenPM()));
        assertEquals(expectedCost, family.costOf(Hour.eightPM()));
        assertEquals(expectedCost, family.costOf(Hour.ninePM()));
        assertEquals(expectedCost, family.costOf(Hour.tenPM()));
    }

    @Test
    public void startAt11PM_eachHourIs20Dollars() {
        int expectedCost = 20;
        assertEquals(expectedCost, family.costOf(Hour.elevenPM()));
        assertEquals(expectedCost, family.costOf(Hour.twelveAM()));
        assertEquals(expectedCost, family.costOf(Hour.oneAM()));
        assertEquals(expectedCost, family.costOf(Hour.twoAM()));
        assertEquals(expectedCost, family.costOf(Hour.threeAM()));
    }

    @Test
    public void fourAMIsZeroDollars() {
        assertEquals(0, family.costOf(Hour.fourAM()));
    }
}
