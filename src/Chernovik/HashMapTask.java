package Chernovik;

import java.util.ArrayList;

public class HashMapTask {
    public static void main(String[] args) {
        myHashTable myHashT = new myHashTable();
        myHashT.add("0","a");
        myHashT.add("1","b");
        myHashT.add("2","c");
        myHashT.add("3","d");
        myHashT.add("4","e");
        myHashT.print();

        //System.out.println("Значения: " + );




    }
}
class myHashTable {
    ArrayList<String>[] data;

    myHashTable() {
        data = new ArrayList[10];//заполнение листа массивом
        for (int i = 0; i < data.length; i++) {
            data[i] = new ArrayList<>();
        }
    }

    public void print() {  // функция печати
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].size(); j++) {
                System.out.println(data[i].get(j));
            }
        }
    }

    public void add(String key, String val) {//добавление элемента по ключу
        data[getPos(key)].add(val);
    }

    private int getPos(String key) {// поиск по ключу
        System.out.println(key.hashCode());
        return key.hashCode() % 10;
    }

//    public  String removeValue(String val) {//поиск по значению
//        System.out.println((val.hashCode()));
//        return val.();
//    }



}
/*Создать класс, который расширяет возможности hashMap. А именно, позволяет
хранить под одним ключом несколько значений. Должны быть реализованы функции
добавления элемента по ключу, поиск по ключу, поиск по значению. Изменение
значения по ключу. Удаление элементов по значению.*/