package PartTwo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Simba", 80));
        animals.add(new Wolf("Akela", 70));
        animals.add(new Rabbit("Bunny", 90));
        animals.add(new Wolf("Ghost", 65));

        Contest c = new Contest(animals.get(0), animals.get(3));

        while (c.getWinner() == null) {
            c.playRound();
        }

        System.out.println("Winner: " + c.getWinner());
    }
}