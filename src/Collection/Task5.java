package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        System.out.println(list.toString());
        for (int i = 0; i < (17 % list.size()); i++) {
            String s = list.get(list.size() - 1);
            list.add(0, s);
            list.remove(list.size() - 1);
        }
        System.out.println(list.toString());
    }
}


/*Создать arraylist типа string и заполнить его 10 строками. Произвести
циклический сдвиг вправо 17 раз и вывести на экран.*/