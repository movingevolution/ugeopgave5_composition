package PartTwo;

public class Contest {

    Animal animalOne;
    Animal animalTwo;
    int round;

    public Contest(Animal animalOne, Animal animalTwo){
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
        round = 1;
    }

    public void playRound() {

        System.out.println("Round: " + round);

        // animal one attacks animal two
        int damage = animalOne.attack();
        animalTwo.changeEnergy(-damage);
        System.out.println(animalOne.getName() + " attacks " + animalTwo.getName() + " with " + damage + " damage point!" );

        // animal two attacks animal one
        if(animalTwo.isActive()) {
            damage = animalTwo.attack();
            animalOne.changeEnergy(-damage);
            System.out.println(animalTwo.getName() + " attacks " + animalOne.getName() + " with " + damage + " damage point!");
        }

        // new round
        round ++;

    }

    public Animal getWinner() {
        if(!animalOne.isActive()) {
            return animalTwo;
        } else if (!animalTwo.isActive()) {
            return animalOne;
        }
        return null;
    }

}
