import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
        0000 0000 = ячекйа 8 бит [адрес]

        128  64  32  16  8   4   2   1   ← веса позиций
        [0]  [1]  [0]  [1]  [1]  [0]  [1]  [0] ← двоичное число
        01011010
        64 + 16 + 8 + 2 = 90

        0101 = 5
        0011 = 3
        --------
        1000
     */
        byte b;  //8 bit  -128  127  (256)
        short s; // 16 bit  -32768 32767 (65536)
        int i; // 32 bit
        long l; // 64 bit

        long ll = 9863459898349855L;

        byte b2 = 127;
        byte b3 = 10;

        System.out.println(b2+b3);

        byte b4 = (byte) (b2+b3);
        System.out.println(b4);

        boolean isTrue = true; // 0 - 1 8 bit

        char c = 'A'; // 2 байта
        char ya = 'Я'; // 1071

        int ii = 12345;
        double dd = 999.99;
        boolean bb = true;
        char cc = 'B';

        int aaa = 120;
        int bbb = aaa;

        String sss = "Hello World!";
        String ss1 = sss;

        System.out.println(Arrays.toString(sss.getBytes()));
        System.out.println(Arrays.toString(sss.getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString(sss.getBytes(StandardCharsets.UTF_16)));

//      Scanner scan = new Scanner(System.in);
//      String line = scan.nextLine();
//      System.out.println("Привет: "+ line);
//      scan.nextInt();
//      scan.nextBoolean();
//      scan.nextDouble();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = sc.nextInt(); // 25\n
        sc.nextLine();
        System.out.println("Введите имя");
        String name = sc.nextLine();
        System.out.println("Ваше имя - " + name + " Ваш возраст - " + age);
// "После каждого nextInt(), nextDouble(), nextBoolean() всегда вызывайте nextLine() для очистки буфера!"
        String line = sc.nextLine();
        sc.nextBoolean();
    }
}