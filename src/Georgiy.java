public class Georgiy implements Analytic, Developer, DevOps {

    @Override
    public Document writeDocument() {
        DocumentsFactory documentsFactory = new DocumentsFactory();
        return documentsFactory.loadFormGit();
    }

    @Override
    public void deployDocument(Document document) {
        System.out.println("Georgiy deployDocument");

    }

    @Override
    public void implementDocument(Document document) {
        System.out.println("Georgiy implementDocument");

    }
}
