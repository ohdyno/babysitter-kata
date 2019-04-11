import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculationTest {

    private PayCalculator calculator = new PayCalculator();

    @Test
    public void babysitterWorkedZeroHours() {
        assertEquals(0, calculator.calculate(Hour.fivePM(), Hour.fivePM(), Family.A()));
    }

    @Test
    public void workedOneHourPastMidnightForFamilyC() {
        assertEquals(15, calculator.calculate(Hour.twelveAM(), Hour.oneAM(), Family.C()));
    }

    @Test
    public void workedTwoHoursForFamilyCAcrossPayGroups() {
        assertEquals(21 + 15, calculator.calculate(Hour.eightPM(), Hour.tenPM(), Family.C()));
    }

    @Test
    public void maximumPayForFamilyA() {
        assertEquals(15 * 6 + 20 * 5, calculator.calculate(Hour.fivePM(), Hour.fourAM(), Family.A()));
    }

    @Test
    public void maximumPayForFamilyB() {
        assertEquals(12 * 5 + 8 * 2 + 16 * 4, calculator.calculate(Hour.fivePM(), Hour.fourAM(), Family.B()));
    }

    @Test
    public void maximumPayForFamilyC() {
        assertEquals(21 * 4 + 15 * 7, calculator.calculate(Hour.fivePM(), Hour.fourAM(), Family.C()));
    }
}
