package PartOne;

public class Lamp {

    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    @Override
    public String toString() {
        String status = isOn ? "on" : "off";
        return "Watt: " + watt + "W " + "," + " Status: " + status;
    }
}
