import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        
        // TODO: Generate random integers for dice rolls
        
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        
        // TODO: Demonstrate the difference between seeded and unseeded
        Random unseededDie1 = new Random();
        Random unseededDie2 = new Random();
        Random unseededDie3 = new Random();

        int seed = 12345;
        Random seededDie = new Random(seed);

        int roll1 = unseededDie1.nextInt(6) + 1;
        int roll2 = unseededDie2.nextInt(6) + 1;
        int roll3 = unseededDie3.nextInt(6) + 1;
        int seededRoll = seededDie.nextInt(6) + 1;

        System.out.println("Unseeded Die 1: " + roll1);
        System.out.println("Unseeded Die 2: " + roll2);
        System.out.println("Unseeded Die 3: " + roll3);
        System.out.println("Seeded Die: " + seededRoll);
    }
}
