import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //int[] a = new int[100];
        boolean isAswered = false;
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i;
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100");
        int move = 0;
        Random random = new Random();
        int move1 = random.nextInt(100);

        for (int i = 0; i < 10; i++) {
            move = scanner.nextInt();

            if (move == move1) {
                System.out.println("Вы угадали с " + i + " попытки");
                isAswered = true;
                break;
            }
            if (move < move1) {
                System.out.println("Загаданное число больше. Попробуйте еще раз");
            }
            if (move > move1) {
                System.out.println("Загаданное число меньше. Попробуйте еще раз");
            }
        }
        if (!isAswered) {
            System.out.println("Вы не угадали. Попытки кончились");
        }
    }
}
