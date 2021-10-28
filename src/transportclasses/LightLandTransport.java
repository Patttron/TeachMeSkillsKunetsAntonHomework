package transportclasses;

import abstractclasses.LandTransport;

public class LightLandTransport extends LandTransport {

    String bodyTypeOfCar;
    int numberOfPassengers;

    public LightLandTransport(int power, int maxSpeed, int weight, String transportBrand, int numberOfWheels, int fuelConsumption, String bodyTypeOfCar, int numberOfPassengers) {
        super(power, maxSpeed, weight, transportBrand, numberOfWheels, fuelConsumption);
        this.bodyTypeOfCar = bodyTypeOfCar;
        this.numberOfPassengers = numberOfPassengers;
    }

    private double fuelConsume(double hours) {
        return fuelConsumption * hours;
    }

    public void feature(double hours) {
        System.out.println("In " + hours + " hours " + transportBrand + " at maximum speed " + maxSpeed + "km/h can drive " +
                maxSpeed * hours + " km " + "and consume " + fuelConsume(hours) + "l.");
    }

    @Override
    public String toString() {
        return super.transportBrand + bodyTypeOfCar + " has power " + super.powerTransformation() + " kilowatts, max speed " + super.maxSpeed +
                "km/h, weight " + super.weight + "kg, has " + numberOfWheels + " wheels and " + numberOfPassengers +
                " seats.";
    }
}
