public class Vehicle {
    protected String brand;
    protected int year;

    // Конструктор родительского класса
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Создан транспорт: " + brand);
    }

    // Метод родительского класса
    public void start() {
        System.out.println(brand + " заводится");
    }

    public void stop() {
        System.out.println(brand + " останавливается");
    }

    // Метод для демонстрации переопределения
    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Год выпуска: " + year);
    }
}
