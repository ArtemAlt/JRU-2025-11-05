public class PdfDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument(String name) {
        /*
        logic pdf
         */
        return new PdfDocument(name);
    }
}
