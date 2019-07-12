package Chernovik;

import java.util.ArrayList;
import java.util.HashSet;

public class Nask3 {
    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<>();
        System.out.println(data.add(0));
        System.out.println(data.add(1));
        System.out.println(data.add(2));
        System.out.println(data.add(3));
        System.out.println(data.add(4));
        System.out.println(data.add(6));
        System.out.println(data.add(8));
        System.out.println(data.add(3));

        ArrayList<Integer> data1 = new ArrayList<>(data);
        for (Integer i : data1) {
            System.out.println(i + " " + i.getClass().getSimpleName());
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-");
        ArrayList<String> data2 = new ArrayList<>();
        for (Integer data1Val : data1) {
            data2.add(String.valueOf(data1Val));
        }
        for (String i : data2) {
            System.out.println(i + " " + i.getClass().getSimpleName());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        System.out.printf("It's number %d", data1.size());
    }
}
