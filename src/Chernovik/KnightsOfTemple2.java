/*package Chernovik;

import java.util.Set;
import java.util.TreeSet;

public class KnightsOfTemple2 {
    public static void main(String[] args) {
        TreeSet<Knights> knights = new TreeSet<>();
        knights.();




    }

    class Knights {
        private String name;
        private int hp;
        private int armor;
        private int damage;

        public String getName() {
            return name;
        }

        public int getHp() {
            return hp;
        }

        public int getArmor() {
            return armor;
        }

        public int getDamage() {
            return damage;
        }


        @Override
        public String toString() {
            return name + hp + armor + damage;
        }

        public Knights(String name, int hp, int armor, int damage) {
            this.name = name;
            this.hp = hp;
            this.armor = armor;
            this.damage = damage;
        }


    }
}
/*Задание 3. Создать класс рыцарь с полями количество здоровья, количество брони, количеством
урона и именем. Провести рыцарский турнир и узнать кто победил используя treeSet, по
критериям количество здоровья, количество брони и наносимый урон.*/