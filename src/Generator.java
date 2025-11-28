import java.util.Date;

public class Generator {

    public static void sayHello() {
        System.out.println("Hello!");
        System.out.println("Welcome!");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static Date getCurrentDate() {
        return new Date();
    }

    //Перегрузка метода
    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public static void printMessage(int message) {
        System.out.println("INT - " + message);
    }
}
