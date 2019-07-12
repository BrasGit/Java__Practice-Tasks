package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(scanner.nextLine());


        }
        String tmp = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i).length() < tmp.length()) {
                tmp = data.get(i);
            }
        }

        String tmp1 = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i).length() > tmp1.length()){
                tmp1 = data.get(i);
            }
        }

      //  int index = str1.indexOf(tmp, tmp1);






    }
}
/*Создать arraylist типа string и заполнить его 10 строками
с клавиатуры. С помощью цикла найти самую маленькую или
самую длинную строку, в зависимости от того, какая встретится
первой*/