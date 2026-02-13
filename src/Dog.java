public class Dog extends Animal {
    private String breed;

    public Dog(String breed, String type) {
        super(type);
        this.breed = breed;
    }
    public String getName() {
        return breed;
    }

    public void setName(String name) {
        breed = name;
    }
}
