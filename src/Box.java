public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public boolean isEmpty() {
        return content == null;
    }

}
