import java.util.Random;

public class Dice {

    private Random random;

    public Dice(Random random) {
        this.random = random;
    }

    public int rollDice(int numberOfDice) {

        if (numberOfDice > 0) {
            return random.nextInt(numberOfDice * 6) + 1;
        }

        System.out.println("ERROR: Number of dice is less than 1");
        return -1;
    }

     public static void main(String []args) {
        System.out.println("Rolling a Die");
        Dice dice = new Dice(new Random());
        System.out.println("Got a " + dice.rollDice(1));
     }
}
