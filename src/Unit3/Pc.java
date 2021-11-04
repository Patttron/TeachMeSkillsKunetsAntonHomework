package Unit3;

import java.util.Scanner;

public class Pc {
    private boolean cpu;
    private boolean ram;
    private boolean hdd;
    protected int onOffLimit;
    protected int onOffCounter = 0;
    int inputSignal;
    int pcSignal;
    Scanner scan = new Scanner(System.in);

    public Pc(boolean cpu, boolean ram, boolean hdd, int onOffLimit) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.onOffLimit = onOffLimit;
    }

    public Pc(boolean cpu, boolean ram, int onOffLimit) {
        this.cpu = cpu;
        this.ram = ram;
        this.onOffLimit = onOffLimit;
    }

    public boolean isCpuInstalled() {
        return cpu;
    }

    public boolean isRamInstalled() {
        return ram;
    }

    public String pcInformation() {
        return "My PC:\n" +
                "cpu is connected= " + cpu +
                ",\nram is connected= " + ram +
                ",\nhdd is connected= " + hdd +
                ",\nloop of turn on/off was= " + onOffCounter + " times";
    }

    public boolean turnOn() {
        pcSignal = (int) (Math.random() * 2);
        System.out.print("For try turn on PC enter 0 or 1: ");
        inputSignal = scan.nextInt();
        if (inputSignal != 0 && inputSignal != 1) {
            System.out.println("You have to enter 0 or 1");
            return turnOn();
        }
        if (pcSignal == inputSignal) {
            System.out.println("Your PC is on");
            return true;
        } else {
            System.out.println("Fail: try again");
            return turnOn();
        }
    }

    public boolean turnOff() {
        pcSignal = (int) (Math.random() * 2);
        System.out.print("For try turn off PC enter 0 or 1: ");
        inputSignal = scan.nextInt();
        if (inputSignal != 0 && inputSignal != 1) {
            System.out.println("You have to enter 0 or 1");
            return turnOff();
        }
        if (pcSignal == inputSignal) {
            System.out.println("Your PC is off");
            return true;
        } else {
            System.out.println("Fail: try again");
            return turnOff();
        }
    }
}
