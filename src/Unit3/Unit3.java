package Unit3;

import java.io.IOException;

public class Unit3 {
    public static void main(String[] args) throws IOException {
        /** Make some PC, turn on/off... */
        Pc intel = new Pc(true, true, true, 2);
        for (; ;) {
            if (intel.isCpuInstalled() && intel.isRamInstalled()) {
                if (intel.onOffCounter > intel.onOffLimit) {
                    System.out.println("WARNING: number of connections was over");
                    break;
                }
                if (intel.turnOn()) {
                    intel.turnOff();
                    intel.onOffCounter++;
                }
                System.out.println("Do you want turn on PC again?\n" +
                        "if yes enter 'y' and another letter if not");
                int x = System.in.read();
                char c = (char) x;
                if(c != 'y'){
                    break;
                }

            } else {
                System.out.println("You don't have enough equipment for turn on PC.");
                break;
            }
        }
        System.out.println(intel.pcInformation());
    }
}
