public class MyClass implements Cloneable{

    @Override
    public String toString() {
        return "MyClass{}";
    }

    @Override
    public MyClass clone() {
        try {
            return (MyClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
