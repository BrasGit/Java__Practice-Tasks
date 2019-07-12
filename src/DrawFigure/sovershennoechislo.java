package DrawFigure;

import java.util.Scanner;

public class sovershennoechislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
        for (int i = 2; i <= x; i++) {
            if (isPerfect(i))
                System.out.println(i);
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            return true;
        return false;
    }
}
