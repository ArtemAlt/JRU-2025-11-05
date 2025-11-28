public class Recursion {

    public static void countdown(int n) {
        if (n == 0) {return;}
        System.out.println(n);
        countdown(n - 1);
    }

    public static void countdown2(int n) {
        while (n != 0) {
            System.out.println(n);
            n--;
        }
    }


    /*
    countdown(3)
  │
  ├── Печатает "3..."
  ├── Вызывает countdown(2)
  │     │
  │     ├── Печатает "2..."
  │     ├── Вызывает countdown(1)
  │     │     │
  │     │     ├── Печатает "1..."
  │     │     ├── Вызывает countdown(0)
  │     │     │     │
  │     │     │     ├── Печатает "0..."
  │     │     │     ├── Вызывает countdown(-1)
  │     │     │     │     │
  │     │     │     │     ├── Печатает "Пуск!"
  │     │     │     │     └── Возврат
  │     │     │     └── Возврат
  │     │     └── Возврат
  │     └── Возврат
  └── Возврат
     */

}
