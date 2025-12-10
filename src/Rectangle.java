public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(int size) {
        this(size, size);
    }

    void info() {
        System.out.println("width: " + this.width + " height: " + this.height);
    }
}
