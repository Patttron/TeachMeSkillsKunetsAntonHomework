package abstractclasses;

abstract public class AirTransport extends Transport {
    public int wingSpan;
    public int minRunwayLength;

    public AirTransport(int power, int maxSpeed, int weight, String transportBrand, int wingSpan, int minRunwayLength) {
        super(power, maxSpeed, weight, transportBrand);
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }
}
