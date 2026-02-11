public interface Analytic {

    Document writeDocument();

    default void log(String message) {
        System.out.println(message);
    }
}
