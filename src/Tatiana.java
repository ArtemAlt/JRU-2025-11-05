public class Tatiana implements Analytic, Developer, Tester, Auditable {

    @Override
    public Document writeDocument() {
         return new Document("Tatiana doc`s");
    }

    @Override
    public void implementDocument(Document document) {
        System.out.println("Tatiana implementDocument");
    }

    @Override
    public void checkDocument(Document document) {
        System.out.println("Tatiana checkDocument");
    }
}
