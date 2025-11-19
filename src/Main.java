import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        while (true) {
//            System.out.println("Цикл");
//        }

//        //Прямой счет
//        int i = 1;
//        while (i < 10) {
//            System.out.println("Итерация - " + i);
//            i++;
//        }
//
//        //Обратый счет
//        int count = 5;
//        while (count >= 0) {
//            System.out.println("Осталось - " + count);
//            count--;
//        }
//
//        // FORi
//        // Прямой счет
//        for (int j = 1; j < 10; j++) {
//            System.out.println("Итерация  * " + j);
//        }
//
//        //Обратный счет
//        for (int k = 5; k >= 0; k--) {
//            System.out.println("FOR - " + k);
//        }

        /*
            while () {

            }

            do {

            } while()
         */

//        Scanner in = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("1. Начать игру");
//            System.out.println("2. Настройки");
//            System.out.println("3. Выход");
//            System.out.print("Выберите пункт: ");
//
//            choice = in.nextInt();
//        } while (choice != 3);

//        for (int i = 0; i < 100; i++) {
//            if (i * i > 50) {
//                System.out.println("Число - " + i);
//                break;
//            }
//            System.out.println("Итерация - " + i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println("Число - " + i);
//        }

//        for (int i = 0; i < 10; i++) { // 0
//            for (int j = 0; j < 10; j++) { // 0
//                System.out.println(i + " " + j);
//            }
//        }
        int a = 5;
        int b = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        O(1) - константная сложность
        O(log n) - логарифмическая сложность
        0(n) - линейная сложность
        0(n^2) - квадратичная сложность
         */
        /*
         1 и 2
         11 12 21 22 (2^2)

         1 и 2 и 3
         11 12 13 21 22 23 31 32 33 (3^2)

         1 и 2 и ........ N (N^2)
         */

        /*
         10 11 12 13 14 15 16 17 18 19 20
          1  2  3  4  5  6  7  8  9 10 11
          20 - номер ячейки этого числа
          бинарный поиск
         */

        /*
        Employ e []
        sal = e[i].getSalary()
        delta = 0.15
        for(int i = 0; i <=  e.size; i++) {
            bonus =  sal * delta;
            sout(bonus)
        }
         */

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Число - " + i);
//        }
    }
}