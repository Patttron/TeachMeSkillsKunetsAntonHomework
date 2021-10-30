package Unit4.transportclasses;

import Unit4.abstractclasses.AirTransport;

public class MilitaryAirTransport extends AirTransport {
    boolean bailoutSystem;
    int missilesOnBoard;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String transportBrand, int wingSpan, int minRunwayLength, boolean bailoutSystem, int missilesOnBoard) {
        super(power, maxSpeed, weight, transportBrand, wingSpan, minRunwayLength);
        this.bailoutSystem = bailoutSystem;
        this.missilesOnBoard = missilesOnBoard;
    }

    public String checkBailoutSystem() {
        return bailoutSystem ? "has bailout system" : "doesn't have bailout system!";
    }

    public String shoot() {
        return (missilesOnBoard != 0) ? "Missile fired!" : "No ammunition";
    }

    @Override
    public String toString() {
        return super.transportBrand + " has power " + super.powerTransformation() + " kilowatts, max speed " + super.maxSpeed +
                "km/h, weight " + super.weight + "kg, " + super.wingSpan + " metres wing span, \nneed " +
                super.minRunwayLength + " metres minimum runway length, has " + missilesOnBoard +
                " missiles on the board and " + checkBailoutSystem();
    }
}
