import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private int age;
    private String passport;
    private MyClass myClass;

    public Person(String name, int age, String passport, MyClass myClass) {}

    public Person(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public Person (Person person) {
        this.name = person.name;
        this.age = person.age;
        this.passport = person.passport;
        this.myClass = person.myClass;
    }

    public static Person copy(Person person) {
        return new Person(person.name, person.age, person.passport, person.myClass);
    }

    @Override
    public String toString() {
        return "Человек - имя : " + name + " возраст: " + age;
    }

    public boolean equals(Person p) {
        System.out.println("Equals person");
        if (p == this) { return true; }
        if (!p.getClass().equals(this.getClass())) { return false; }
        Person p1 = (Person) p;
        return p1.name.equals(this.name) && p1.age == this.age;
//        return false;
    }
    /*
    x.equals(x) = true
    x.equals(y) = true y.equals(x) = true
    x.equals(y) y.equals(z) x.equals(z) = true
    x.equals(x) x.equals(x) x.equals(x) = true
    x.equals(null) = false
     */

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals object");
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(passport, person.passport);
    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            clone.myClass = this.myClass.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    /*
    x.equals(y) = false  x.hashCode() != y.hashCode()
    x.equals(y) x.hashCode() == y.hashCode()
    x.hashCode() == y.hashCode() x.equals(y)=false коллизия
         */
}
