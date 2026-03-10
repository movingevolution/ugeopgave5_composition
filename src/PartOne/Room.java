package PartOne;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }

    public int getTotalWatt() {
        int sum = 0;
        for(Lamp l : lamps) {
            sum += l.getWatt();
        }
        return sum;
    }

    public int getTotalWindowArea() {
        int sum = 0;
        for(Window w : windows) {
            sum += w.getAreaCm2();
        }
        return sum;
    }

    public void printRoom() {

        System.out.println("Room: " + name);
        System.out.println("Lamps: " + lamps.size());
        System.out.println("Windows: " + windows.size());
        System.out.println("Watts: " + getTotalWatt() );
        System.out.println("Window Area: " + getTotalWindowArea());
    }


}
