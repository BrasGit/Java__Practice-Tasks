/*package Chernovik;

import java.util.Set;
import java.util.TreeSet;

public class KnightsOfTemple {
    public static void main(String[] args) {


        TreeSet<Knight> knights = new TreeSet<>();

        knights.add(new Knight("aa", 50, 25));
        knights.add(new Knight("bb", 40, 29));
        knights.add(new Knight("cc", 60, 40));
        knights.add(new Knight("dd", 20, 10));
        knights.add(new Knight("ee", 70, 30));


        printSet(knights);
        System.out.println(knights.first());
    }
   private static void printSet(Set<Knight>set){
        for (Knight w : set) {
            System.out.println(w);
        }
    }
}

class Knight implements Comparable<Knight> {
    private String name;
    private int health;
    private int attack;

    @Override
    public String toString() {
        return name + " " + health + " "+  attack;
    }

    public String getName() { return name; }

    public int getHealth() { return health; }

    public int getAttack() { return attack; }

    public Knight(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    @Override
    public int compareTo(Knight w) {
        return (this.health/2+this.attack) - (w.health/2+w.attack);
    }
}
/*Здание 1. Создать класс воин с полями количество здоровье, количество урона и имя. Написать
компаратор для сравнения этих двух воинов по количеству наносимого урона. Найти самого
слабого и самого сильного рыцаря из списка 10 рыцарей используя treeSet*/
