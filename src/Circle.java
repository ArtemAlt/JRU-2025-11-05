class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация абстрактного метода интерфейса
    @Override
    public void draw() {
        System.out.println("Рисую круг радиусом " + radius);
    }
}