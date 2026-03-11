public class WordDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument(String name) {
        /*
        logic
         */
        return new WordDocument(name);
    }
}
