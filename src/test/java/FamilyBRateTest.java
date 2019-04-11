import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyBRateTest {

    private final Family family = Family.B();

    @Test
    public void before10PM_eachHourIs12Dollars() {
        int expectedCost = 12;
        assertEquals(expectedCost, family.costOf(Hour.fivePM()));
        assertEquals(expectedCost, family.costOf(Hour.sixPM()));
        assertEquals(expectedCost, family.costOf(Hour.sevenPM()));
        assertEquals(expectedCost, family.costOf(Hour.eightPM()));
        assertEquals(expectedCost, family.costOf(Hour.ninePM()));
    }

    @Test
    public void between10PM_and_12AM_eachHourIs8Dollars() {
        int expectedCost = 8;
        assertEquals(expectedCost, family.costOf(Hour.tenPM()));
        assertEquals(expectedCost, family.costOf(Hour.elevenPM()));
    }

    @Test
    public void after12AM_eachHourIs16Dollars() {
        int expectedCost = 16;
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
