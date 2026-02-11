public class Document {
    private  String title;

    public Document(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                '}';
    }
}
