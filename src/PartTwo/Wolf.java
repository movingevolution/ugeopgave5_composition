package PartTwo;

public class Wolf extends Animal {

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return (int)(Math.random() * 101);
    }
}
