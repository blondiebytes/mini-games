import java.util.*;

public class Dice {

    private Random random;

    public Dice(Random random) {
        this.random = random;
    }

    public int roll_dice() {
        return random.nextInt(6);
    }

     public static void main(String []args) {
        System.out.println("Rolling a Die");
        Dice dice = new Dice(new Random());
        System.out.println("Got a " + dice.roll_dice());
     }
}
