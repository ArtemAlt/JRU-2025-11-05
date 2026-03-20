@MyAnnotation(greeting = "Hello World", id = 10)
public class MyClass2 {

    @Override
    public String toString() {
        MyAnnotation annotation = this.getClass().getAnnotation(MyAnnotation.class);
        return "Greeting: " + annotation.greeting() + " Id: " + annotation.id();
    }
}
