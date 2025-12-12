public class OuterClass {
    private static String staticField = "Статическое поле";
    private String nonStaticField = "Не статическое поле";

    static class InnerClass {
        void innerMethod() {
            System.out.println(staticField);
//            System.out.println(nonStaticField);
        }
    }

    class InnerClass2 {
        void innerMethod() {
            System.out.println(nonStaticField);
        }
    }
}
