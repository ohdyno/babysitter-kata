public class PayCalculator {
    public int calculate(Hour start, Hour end, Family family) {
        int total = 0;
        Hour current = start;
        while (current.isBetween(start, end)) {
            total += family.costOf(current);
            current = current.next();
        }
        return total;
    }
}
