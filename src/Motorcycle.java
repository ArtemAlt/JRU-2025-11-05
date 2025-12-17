public class Motorcycle extends Vehicle {
    private int power;

    public Motorcycle(String brand, int year, int power) {
        super(brand, year);
        this.power = power;
        System.out.println("Motorcycle created");
    }

    public void superPower() {
        System.out.println("Motorcycle super power is " + power);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "power=" + power +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
