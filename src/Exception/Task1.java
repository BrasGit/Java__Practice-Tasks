package Exception;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            a = (1 / a);
            if (a == 0) {
                throw new Exception("Число 'a' не должно быть равно 0");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа заверщена");
    }
}
/*Написать программу, которая будет считать значение функции f(x) = 1 / x при заданных
значениях. Программа может принимать на вход любые значения отличные от нуля. Поймать в ней
случай деления на ноль с помощью exeption’ов так, чтобы программа не завершала свою работу.*/