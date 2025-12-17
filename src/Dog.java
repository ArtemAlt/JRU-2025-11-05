class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);  // Вызов конструктора родителя
        this.breed = breed;
    }

    // Реализация абстрактного метода makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }

    // Реализация абстрактного метода eat()
    @Override
    public void eat(String food) {
        System.out.println(name + " ест " + food);
        if (food.equals("кость")) {
            System.out.println("Собака особенно любит кости!");
        }
    }

    // Переопределение конкретного метода (не обязательно)
    @Override
    public void sleep() {
        System.out.println(name + " спит на своей подстилке");
        super.sleep();  // Можно вызвать реализацию родителя
    }

    // Добавление нового метода
    public void fetch(String item) {
        System.out.println(name + " приносит " + item);
    }
}