package PartOne;

public class Main {

    public static void main(String[] args){

        Building b = new Building("Casa Home");

        Room livingRoom = new Room("Living room");
        Room kitchen = new Room("Kitchen");

        // lamper
        livingRoom.addLamp(new Lamp(60));
        livingRoom.addLamp(new Lamp(40));

        kitchen.addLamp(new Lamp(50));

        // vinduer
        livingRoom.addWindow(new Window(120, 100));
        livingRoom.addWindow(new Window(80, 100));

        kitchen.addWindow(new Window(100, 90));

        // tilføj rum til bygning
        b.addRoom(livingRoom);
        b.addRoom(kitchen);

        // print hele bygningen
        b.printBuilding();


    }

}
