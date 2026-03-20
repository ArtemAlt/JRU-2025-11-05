public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
    }

    public Person() {
        System.out.println("Constructor");
    }

    private  String greeting() {
        return "Hello " + this.firstName + " " + this.lastName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
