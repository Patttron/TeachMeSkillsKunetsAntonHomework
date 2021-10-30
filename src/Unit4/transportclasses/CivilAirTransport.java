package Unit4.transportclasses;

import Unit4.abstractclasses.AirTransport;

public class CivilAirTransport extends AirTransport {
    int numberOfPassengersSeats;
    boolean haveBusinessClass;

    public CivilAirTransport(int power, int maxSpeed, int weight, String transportBrand, int wingSpan, int minRunwayLength, int numberOfPassengersSeats, boolean haveBusinessClass) {
        super(power, maxSpeed, weight, transportBrand, wingSpan, minRunwayLength);
        this.numberOfPassengersSeats = numberOfPassengersSeats;
        this.haveBusinessClass = haveBusinessClass;
    }

    public String businessClass() {
        return haveBusinessClass ? " has " : " doesn't have ";
    }

    public String checkPassengerSeats(int passengers) {
        return passengers > numberOfPassengersSeats ? "You need plane bigger!" : "Plane loaded.";
    }

    @Override
    public String toString() {
        return super.transportBrand + " has power " + super.powerTransformation() + " kilowatts, max speed " + super.maxSpeed +
                "km/h, weight " + super.weight + "kg, " + super.wingSpan + " metres wing span, \nneed " +
                super.minRunwayLength + " metres minimum runway length, can put " + numberOfPassengersSeats +
                " passengers on a board and" + businessClass() + "business class.";
    }
}
