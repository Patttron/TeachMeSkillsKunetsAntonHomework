package Unit4.transportclasses;

import Unit4.abstractclasses.LandTransport;

public class CargoLandTransport extends LandTransport {
    double carryingCapacity;

    public CargoLandTransport(int power, int maxSpeed, int weight, String transportBrand, int numberOfWheels, int fuelConsumption, int carryingCapacity) {
        super(power, maxSpeed, weight, transportBrand, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public String checkCarryingCapacity(double weightOfCargo) {
        return weightOfCargo > carryingCapacity ? "You need track bigger!" : "Track loaded.";
    }

    @Override
    public String toString() {
        return super.transportBrand + " has power " + super.powerTransformation() + " kilowatts, max speed " + super.maxSpeed +
                "km/h, weight " + super.weight + "kg, has " + numberOfWheels + " wheels and carrying capacity " +
                carryingCapacity + "ton.";
    }

}
