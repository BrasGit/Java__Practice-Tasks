package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        ArrayList<String> data = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            data.add(scanner.next());
        }
        String tmp = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i).length() < tmp.length()) {
                tmp = data.get(i);
            }
        }
        System.out.println(tmp);


    }
}
/*Создать arraylist типа string и заполнить его 10 строками с клавиатуры. С
помощью цикла найти строку минимальной длины(или несколько, если таковые
имеются) и вывести её(их) на экран.*/