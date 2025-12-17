
public interface Drawable {

    void draw();

    default void setColor(String color) {
        System.out.println("Changed color to: " + color);
    }
}
