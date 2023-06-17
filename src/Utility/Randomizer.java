package Utility;

import java.util.Random;

public class Randomizer {

    Random random = new Random();

    public Randomizer () {}

    public int packageType () {

        return random.nextInt(2) + 1;
    }

}
