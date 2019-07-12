package Chernovik;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.util.Random;
import java.util.Scanner;

public class Shablon {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 0.Rock, 1.Paper, 2.Scissors");
        int move = 0;
        while (true) {
            try {
                move = scanner.nextInt();
                if (move < 0 || move > 2)
                    throw new Exception("Bad input");
                else
                    break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Random random = new Random();
        int move1 = random.nextInt(3);
        switch (move) {
            case 0:
                System.out.println("user rock");
                break;
            case 1:
                System.out.println("user paper");
                break;
            case 2:
                System.out.println("user scissors");
                break;
        }
        switch (move1) {
            case 0:
                System.out.println("computer rock");
                break;
            case 1:
                System.out.println("computer paper");
                break;
            case 2:
                System.out.println("computer scissors");
                break;
        }

        if (move == move1) {
            System.out.println("Ничья");
        } else if ((move == 0 && move1 == 1) || (move == 1 && move1 == 0) || (move == 2 && move1 == 1) || (move == 0 && move1 == 2)) {
            System.out.println("Вы выиграли");
        } else System.out.println("Вы проиграли");

    }
}


