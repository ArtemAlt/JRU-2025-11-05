public class WordDocument implements Document {
    private String word;

    public WordDocument(String word) {
        this.word = word;
    }

    @Override
    public void open() {
        System.out.println("open WordDocument");
    }

    @Override
    public void close() {
        System.out.println("close WordDocument");
    }

    @Override
    public void save() {
        System.out.println("save WordDocument");
    }

    @Override
    public String getType() {
        return word;
    }
}
