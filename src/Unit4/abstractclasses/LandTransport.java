package Unit4.abstractclasses;

abstract public class LandTransport extends Transport {
    public int numberOfWheels;
    public int fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, String transportBrand, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, transportBrand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
