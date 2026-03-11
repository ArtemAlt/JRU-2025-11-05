abstract class DocumentCreator {

    public abstract Document createDocument(String name);

    public void processDocument(Document document) {
        System.out.println("Process document type " + document.getType());
        document.open();
        document.save();
        document.close();
    }
}
