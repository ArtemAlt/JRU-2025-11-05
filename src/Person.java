public class Person {
    private String name;
    private int age;
    private String fullInfo;

    public Person(String имя, int возраст) {
        if (возраст < 0) {
            this.age = 0;
        } else {
            this.age = возраст;
        }
        this.name = имя;
        this.fullInfo = this.name + " " + this.age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullInfo() {
        return fullInfo;
    }
}
