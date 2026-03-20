@MyAnnotation(greeting = "Hello World 3", id = 103)
public class MyClass3 {


    @Override
    public String toString() {
        MyAnnotation annotation = this.getClass().getAnnotation(MyAnnotation.class);
        return "Greeting: " + annotation.greeting() + " Id: " + annotation.id();
    }
}
