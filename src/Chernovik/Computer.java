package Chernovik;

import java.util.Random;

public class Computer implements Player{
    Random random = new Random();
    int move1 = random.nextInt(3);


    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getMove() {
        return 0;
    }

    @Override
    public void getPoint() {

    }

    @Override
    public int getPoints() {
        return 0;
    }
}
