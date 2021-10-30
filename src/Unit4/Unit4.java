package Unit4;

import Unit4.transportclasses.CargoLandTransport;
import Unit4.transportclasses.CivilAirTransport;
import Unit4.transportclasses.LightLandTransport;
import Unit4.transportclasses.MilitaryAirTransport;

public class Unit4 {

    public static void main(String[] args) {
        CivilAirTransport belavia = new CivilAirTransport(111000, 1000, 79000,
                "Boeing737-800", 63, 1300, 190, false);
        MilitaryAirTransport mig35 = new MilitaryAirTransport(50000, 2500, 11000,
                "Mig 35", 12, 100, false, 4);
        LightLandTransport hondaCivic = new LightLandTransport(135, 200, 1250, "Honda Civic VIII ",
                4, 9, "sedan", 5);
        CargoLandTransport belaz = new CargoLandTransport(3500, 40, 24000, "BELAZ75600",
                8, 1300, 400);
        System.out.println(belavia);
        System.out.println(belavia.checkPassengerSeats(999));
        System.out.println(mig35);
        System.out.println(mig35.shoot());
        System.out.println(hondaCivic);
        hondaCivic.feature(6);
        System.out.println(mig35);
        System.out.println(mig35.checkBailoutSystem());
        System.out.println(mig35.shoot());
        System.out.println(belaz);
        System.out.println(belaz.checkCarryingCapacity(500));
    }
}
