// Ключевое слово abstract
abstract class Animal {
    protected String name;
    protected int age;

    // Конструктор абстрактного класса
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод (без реализации)
    // Должен быть реализован в подклассах
    public abstract void makeSound();

    // Абстрактный метод может иметь параметры
    public abstract void eat(String food);

    // Конкретный метод (с реализацией)
    // Может использоваться как есть или переопределяться
    public void sleep() {
        System.out.println(name + " спит");
    }

    // Конкретный метод с реализацией
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    // final метод в абстрактном классе
    public final void breathe() {
        System.out.println(name + " дышит");
    }

    // Можно иметь static методы
    public static void printAnimalFact() {
        System.out.println("Все животные являются многоклеточными организмами");
    }
}
