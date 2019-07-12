/*package DrawFigure;

public class PifagorovChisla {
    public static void main(String[] args) {



        for (int a = 0; a <100 ; a++) {
            for (int b = 0; b <100 ; b++) {
                for (int c = 0; c <100 ; c++) {
                    if ((a*a)+(b*b)==(c*c)){
                        System.out.println();
                    }
                }
            }
        }
        public    int nod (int a, int b) {
            if (b == 0)
                return a;
            return nod (b, a % b);
        }
    }
}
/*Пифагоровы числа. Три натуральных числа a, b и c образуют пифагорову тройку, если
c2=a2+b2. Пифагорова тройка называется основной, если наибольший общий делитель ее чисел
равен единице. Например, 3, 4, 5 - основная тройка, 6, 8, 10 - производная тройка. Найдите все
основные пифагоровы тройки, числа в которых не превышают данное число max.*/