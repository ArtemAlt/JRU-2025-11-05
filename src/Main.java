import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
byte
short
int
long
float
double
char
boolean
 */

/*
// Примитивный тип | Класс-обертка
byte              → Byte
short             → Short
int               → Integer
long              → Long
float             → Float
double            → Double
char              → Character
boolean           → Boolean
 */
//        Integer integer = new Integer("1");
//        int i = 1;
//        System.out.println(integer);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        System.out.println(Integer.parseInt("123"));     // возвращает int (123)
//        System.out.println(Integer.valueOf("456"));      // возвращает Integer (456)
//
//        Integer num1 = 100;  // autoboxing: int → Integer
//        int num2 = num1;     // unboxing: Integer → int

//        Car car = new Car("Toyota", 2025, 4, "diesel");
//        Motorcycle motorcycle = new Motorcycle("Kavasaky", 2020, 250);
//        Vehicle vehicle = new Vehicle("Транспорт", 2021);
//        car.honk();
//        car.stop();
//        car.start();
//        System.out.println(car.toString());
//
//        motorcycle.start();
//        motorcycle.stop();
//        motorcycle.superPower();
//        System.out.println(motorcycle.toString());

//        vehicle.start();
//        vehicle.stop();
//        boolean b = car instanceof Vehicle;
//        System.out.println(b);
//        boolean b1 = car instanceof Car;
//        System.out.println(b1);
//        boolean b3 = car instanceof Object;
//        System.out.println(b3);
//        Animal animal = new Animal("Кит", 100);

//        Animal dog = new Dog("Sharik", 1, "Volkodav");
//        Dog dog1 = new Dog("Sharik2", 2, "Volkodav3");

            /*
    Сравнение абстрактных и конкретных классов:

    1. Создание экземпляров:
       - Конкретный класс: можно создать экземпляр
       - Абстрактный класс: НЕЛЬЗЯ создать экземпляр напрямую

    2. Абстрактные методы:
       - Конкретный класс: не может содержать абстрактных методов
       - Абстрактный класс: может содержать абстрактные методы

    3. Назначение:
       - Конкретный класс: законченная реализация
       - Абстрактный класс: шаблон или частичная реализация

    4. Наследование:
       - Конкретный класс: можно наследовать как обычно
       - Абстрактный класс: подкласс ДОЛЖЕН реализовать все абстрактные методы
    */

//        System.out.println("=== Система платежей ===\n");
//
//        // Создаем разные методы платежа
//        PaymentMethod creditCard = new CreditCardPayment("4111-1111-1111-1111", "12/25", "123");
//        PaymentMethod paypal = new PayPalPayment("user@example.com");
//
//        // Используем полиморфизм
//        PaymentMethod[] payments = {creditCard, paypal};
//
//        for (PaymentMethod payment : payments) {
//            System.out.println("\nОбработка платежа:");
//            payment.printReceipt(1000.0);
//            payment.getPaymentDetails();
//        }

/*
    Сравнение интерфейсов и абстрактных классов:

    | Критерий              | Интерфейсы                          | Абстрактные классы                |
    |-----------------------|-------------------------------------|-----------------------------------|
    | Наследование          | Множественное (много интерфейсов)   | Одиночное (один класс)           |
    | Поля                  | Только константы (static final)    | Любые поля                       |
    | Конструкторы          | Нельзя иметь                       | Можно иметь                      |
    | Модификаторы методов  | public (неявно)                    | Любые (public, protected, etc.)  |
    | Реализация методов    | default методы (с Java 8)          | Конкретные методы                |
    | static методы         | Да (с Java 8)                      | Да                               |
    | private методы        | Да (с Java 9)                      | Да                               |

    Когда использовать интерфейсы:
    1. Когда разные классы должны реализовать один контракт
    2. Когда нужна поддержка множественного "наследования"
    3. Для определения API (программного интерфейса)
    4. Для функциональных интерфейсов и лямбда-выражений

    Когда использовать абстрактные классы:
    1. Когда есть общая реализация для родственных классов
    2. Когда нужно сохранить состояние (поля)
    3. Когда нужны конструкторы
    4. Для организации иерархии классов
    */
//
//        Box box = new Box<String>("string");
//        Box box2 = new Box<Integer>(100);
//        Box box3 = new Box<Box>(new Box("box"));

//        List<String> fruits = new ArrayList<>();
//        fruits.add("Яблоко");               // Добавление в конец
//        fruits.add("Банан");
//        fruits.add("Апельсин");
//        System.out.println(fruits);
//        fruits.add(1, "Груша");
//        System.out.println(fruits);
//
//        String first = fruits.get(0);
//        fruits.set(2, "Киви");
//
//        fruits.remove(0);                   // Удаление по индексу
//        fruits.remove("Банан");             // Удаление по значению

    }
}