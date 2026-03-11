public class DocumentFactory {

    public Document createDocumentByType(DocType type, String fileName) {
        switch (type) {
            case WORD:
                        /*        logic word         */
                return new WordDocument(fileName);

            case PDF:
                        /*        logic pdf         */
                return new PdfDocument(fileName);
        }
        return null;
    };
}
