import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceTest {

    Random random = new Random(1);
    Dice underTest = new Dice(random);

    @Test
    public void roll_dice() {
        assertEquals(4, underTest.rollDice(1));
    }
}