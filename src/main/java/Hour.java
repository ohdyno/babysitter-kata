import java.util.Objects;

public class Hour {

    private int hour;

    private static final Hour LAST = fourAM();

    private int hour() {
        return hour;
    }

    private Hour(int hour) {
        this.hour = hour;
    }

    Hour next() {
        return new Hour(Math.min(LAST.hour(), this.hour() + 1));
    }

    boolean isBetween(Hour lowerInclusive, Hour upperExclusive) {
        return lowerInclusive.hour() <= this.hour() && this.hour() < upperExclusive.hour();
    }

    static Hour fivePM() {
        return new Hour(5);
    }

    static Hour sixPM() {
        return new Hour(6);
    }

    static Hour sevenPM() {
        return new Hour(7);
    }

    static Hour eightPM() {
        return new Hour(8);
    }

    static Hour ninePM() {
        return new Hour(9);
    }

    static Hour tenPM() {
        return new Hour(10);
    }

    static Hour elevenPM() {
        return new Hour(11);
    }

    static Hour twelveAM() {
        return new Hour(12);
    }

    static Hour oneAM() {
        return new Hour(13);
    }

    static Hour twoAM() {
        return new Hour(14);
    }

    static Hour threeAM() {
        return new Hour(15);
    }

    static Hour fourAM() {
        return new Hour(16);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hour hour1 = (Hour) o;
        return hour == hour1.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour);
    }
}
