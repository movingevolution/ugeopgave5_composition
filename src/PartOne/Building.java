package PartOne;

import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom (Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int sum = 0;
        for(Room r : rooms) {
            sum += r.getLampCount();
        }
        return sum;
    }

    public int getTotalWatt() {
        int sum = 0;
        for(Room r : rooms) {
            sum += r.getTotalWatt();
        }
        return sum;
    }

    public int getTotalWindowArea() {
        int sum = 0;
        for(Room r : rooms) {
            sum += r.getTotalWindowArea();
        }
        return sum;
    }


    public void printBuilding() {
        System.out.println("===== " + name + " =====" );

        for(Room r : rooms) {
            r.printRoom();
            System.out.println();
        }

        System.out.println("Building Stats:");
        System.out.println("Lamps Total " + getTotalLampCount());
        System.out.println("Watts Total :" + getTotalWatt());
        System.out.println("Window Area Total :" + getTotalWindowArea());

    }

}
