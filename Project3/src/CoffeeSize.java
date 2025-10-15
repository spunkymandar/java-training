public enum CoffeeSize {
    SMALL(1.0),
    MEDIUM(1.2),
    LARGE(1.5);

    private final double multiplier;

    CoffeeSize(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
