package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(0,scanner.nextLine());
        }
        for (String str : list){
            System.out.println(str);
        }


    }
}
/*Создать arraylist типа string произвольной длины. Добавлять в него строки.
Но не в конец, а в начало списка.*/