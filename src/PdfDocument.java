public class PdfDocument implements Document {
    private String pdf;

    public PdfDocument(String pdf) {
        this.pdf = pdf;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF");
    }

    @Override
    public String getType() {
        return pdf;
    }
}
