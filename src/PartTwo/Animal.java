package PartTwo;

public abstract class Animal {

    public String name;
    public int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;

    }

    public String getName(){
        return name;
    }

    public int getEnergy(){
        return energy;
    }

    public boolean isActive(){
        return energy > 0;
    }

    public void changeEnergy(int amount) {
        energy += amount;
    }

    public abstract int attack();


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " \"" + name + "\" (energy: " + energy + ")";
    }

}
