package Chernovik;

import java.util.Scanner;

public class Human implements  Player{

    Scanner scanner = new Scanner(System.in);
    int move = scanner.nextInt();



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
