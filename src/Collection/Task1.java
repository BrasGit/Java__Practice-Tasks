package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1{
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();

        data.add("g");
        data.add("d");
        data.add("s");
        data.add("b");
        data.add("q");

        for (String a: data){
            System.out.println(a);
        }
    }
}
/*Создать arraylist типа string и заполнить его 10 строками. Вывести на экран
содержимое списка.*/