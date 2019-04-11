public interface Family {
    static Family A() {
        return new A();
    }

    static Family B() {
        return new B();
    }

    static Family C() {
        return new C();
    }

    int costOf(Hour hour);
}

class A implements Family {
    @Override
    public int costOf(Hour hour) {
        if (hour.equals(Hour.fourAM())) {
            return 0;
        }

        if (hour.isBetween(Hour.fivePM(), Hour.elevenPM())) {
            return 15;
        }
        return 20;
    }
}

class B implements Family {
    @Override
    public int costOf(Hour hour) {
        if (hour.equals(Hour.fourAM())) {
            return 0;
        }

        if (hour.isBetween(Hour.fivePM(), Hour.tenPM())) {
            return 12;
        }

        if (hour.isBetween(Hour.tenPM(), Hour.twelveAM())) {
            return 8;
        }

        return 16;
    }
}

class C implements Family {
    @Override
    public int costOf(Hour hour) {
        if (hour.equals(Hour.fourAM())) {
            return 0;
        }

        if (hour.isBetween(Hour.fivePM(), Hour.ninePM())) {
            return 21;
        }
        return 15;
    }
}

