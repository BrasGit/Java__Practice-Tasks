package Chernovik;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PotokiTask1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Cutin", "Jack", new int[]{1, 2, 3, 4, 5, 6, 7}, 4.5));
        students.add(new Student("Cbgfbutin", "Jack", new int[]{1, 5, 6, 7}, 4.4));
        students.add(new Student("Cutbfgin", "Jacsdfsk", new int[]{1, 2, 3, 4, 5, 6, 7}, 4.2));
        students.add(new Student("Cutisssssssn", "Jacgbffgk", new int[]{1, 2, 5, 6, 7}, 4.7));
        students.add(new Student("Cutiiiiiiiin", "Jacdsfdsk", new int[]{3, 4, 5, 6, 7}, 5.0));

        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("src/res/fileForStudents.dat"))) {
            ous.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayList<Student> newStudents = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/res/fileForStudents.dat"))){
            newStudents = (ArrayList<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Student newStudent : newStudents) {
            System.out.println(newStudent.name);
            System.out.println(newStudent.surname);
            System.out.println(newStudent.assessment);
            System.out.println("------------");
        }
    }
}


class Student implements Serializable {
     String surname;
    String name;
    int[] table;
    double assessment;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int[] getTable() {
        return table;
    }

    public double getAssessment() {
        return assessment;
    }

    public Student(String surname, String name, int[] table, double assessment) {
        this.surname = surname;
        this.name = name;
        this.table = table;
        this.assessment = assessment;
    }
}

/*Создать класс студент с полями фамилия, имя, массив с оценками и поле со средним
значением оценки. Используя сериализацию записать в файл данные о 10 студентах и
впоследствии считать из файла и вывести информацию о них.*/