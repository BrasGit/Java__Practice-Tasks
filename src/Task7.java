public class Task7 {
    public static void main(String[] args) {
        First first = new First(5,4);

        System.out.println(first.comparison());
        first.getsum();
        System.out.println(first.getsum());

    }
}
    class First {
        int a;
        int b;

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public First(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getsum() {
             return  a + b;

        }
        public int comparison(){
            if (a > b) {
             return a;
            } else {
               return b;
            }
        }
    }

/*Создать класс с двумя переменными. Добавить функцию вывода на экран и функцию
изменения этих переменных. Добавить функцию, которая находит сумму значений этих
переменных, и функцию которая находит наибольшее значение из этих двух переменных.*/