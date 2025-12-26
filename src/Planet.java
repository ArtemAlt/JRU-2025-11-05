public enum Planet {
    MERCURY("Меркурий", 3.303e23, 2.4397e6),
    VENUS("Венера", 4.869e24, 6.0518e6),
    EARTH("Земля", 5.976e24, 6.37814e6),
    MARS("Марс", 6.421e23, 3.3972e6),
    JUPITER("Юпитер", 1.9e27, 7.1492e7),
    SATURN("Сатурн", 5.688e26, 6.0268e7),
    URANUS("Уран", 8.686e25, 2.5559e7),
    NEPTUNE("Нептун", 1.024e26, 2.4746e7);

    private final String russianName;
    private final double mass;
    private final double radius;

    private Planet(String russianName, double mass, double radius) {
        this.russianName = russianName;
        this.mass = mass;
        this.radius = radius;
    }


    public String getRussianName() {
        return russianName;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public static Planet findPlanetByRussianNameOrNull(String russianName) {
        for (Planet planet : Planet.values()) {
            if (planet.russianName.equalsIgnoreCase(russianName)) {
                return planet;
            }
        }
        return null; //дефолт-планета
    }

    public double getSurfaceGravity() {
        final double G = 6.673e-11; // гравитационная постоянная
        return G * mass / (radius * radius);
    }


    @Override
    public String toString() {
        return "Planet{" +
                "russianName='" + russianName + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                '}';
    }
}
