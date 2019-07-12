package Chernovik;

import java.util.NavigableSet;
import java.util.TreeMap;

public class TaskWinnerFight {
    public static void main(String[] args) {
  /*      TreeMap<Integer, String> tableWinner = new TreeMap<>();
        tableWinner.put(49, "Nick");
        tableWinner.put(57, "Tom");
        tableWinner.put(21, "Kira");
        tableWinner.put(89, "Erik");
        System.out.println(tableWinner.descendingKeySet());*/



        TreeMap<Integer, Unit> treeMap = new TreeMap<>();

        for (int i = 0; i < 4; i++) {
            Unit tmp = new Unit("Knight " + i, (i + 1) * 2);
            treeMap.put(tmp.honor, tmp);
        }
        System.out.println(treeMap);

    }
}
class Unit {
    String name;
    int honor;

    @Override
    public String toString() {
        return  name + honor ;
    }



    public Unit(String name, int honor) {
        this.name = name;
        this.honor = honor;
    }
}

/*Задача 1. Рыцарский турнир закончился! Пришла пора объявить победителей. Но безответственный
клерк перепутал имена участников и теперь не может составить их правильный список. Нужно ему
помочь. А именно, используя treeMap создать список участников с полями “Честь” и соответствующее
ему “Имя рыцаря” и показать отсортированный список. Помним, чем больше чести, тем ближе к
верхушке турнирной таблицы.*/