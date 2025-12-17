import java.io.Serializable;

public class Car extends Vehicle implements Drawable, Serializable {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
        System.out.println("Car created");
    }

    public void honk() {
        System.out.println(brand + " сигналит: Би-бип!");
    }

    @Override
    public void start() {
        System.out.println(brand + " заводится ключом");
    }

    @Override
    public void stop() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Car drawn");
    }
}
