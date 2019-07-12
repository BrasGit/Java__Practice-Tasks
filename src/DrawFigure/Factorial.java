package DrawFigure;

import java.util.LinkedList;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calc(21));

    }

    public static long calc(long n) {
        if (n <= 1)
            return 1;
        else
            return n * calc(n - 1);

    }
}
/*Задача 5. Б. Кордемский указывает одно интересное число 145, которое равно сумме факториалов
своих цифр: 145=1!+4!+5!. Он пишет, что неизвестно, есть ли еще такие числа,
удовлетворяющие названному условию. Написать программу по нахождению таких чисел.*/
//145!=1*2*3*...*145.