public class Temperature {
    private final double cDegree = 25;
    public double getFConversion() {
        return cDegree * 9 / 5 + 32;
    }

    public double getKenvinConversion() {
        return cDegree + 273.15;
    }
}
