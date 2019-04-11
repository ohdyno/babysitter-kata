import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyCRateTest {
    private final Family family = Family.C();

    @Test
    public void before9PM_eachHourIs21Dollars() {
        int expectedCost = 21;
        assertEquals(expectedCost, family.costOf(Hour.fivePM()));
        assertEquals(expectedCost, family.costOf(Hour.sixPM()));
        assertEquals(expectedCost, family.costOf(Hour.sevenPM()));
        assertEquals(expectedCost, family.costOf(Hour.eightPM()));
    }

    @Test
    public void after9PM_eachHourIs15Dollars() {
        int expectedCost = 15;
        assertEquals(expectedCost, family.costOf(Hour.ninePM()));
        assertEquals(expectedCost, family.costOf(Hour.tenPM()));
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
