public class Main {
    public static void main(String[] args) {
//        AuthProvider googleAuthProvider = new GoogleAuthProvider("https://google.com/auth", "Bearer ldfkjkdjfgkjkjbfsxlusgDw09rhkdsjfbfjsd");
//
//        User vasya = googleAuthProvider.authenticate("Vasya");
//        System.out.println(vasya);
//
//        AuthProvider esiaProvider = new ESIAAuthProvider("https://gosuslugi.ru/auth", "Bearer l;ishdffyw9493bknsdjdhff");
//        User ilya = esiaProvider.authenticate("Ilya");
//        System.out.println(ilya);

//        email.EmailService emailService = new email.EmailService("yandex.ru", 587);
//
//        emailService.sendEmail("me", "you","Nice!!!");
        Parent p = new Parent();
        someMethod(p.getValue());

        Child c = new Child();
        someMethod(c.getValue());

    }

    public static void someMethod(Number sum) {
        System.out.println(sum.intValue() + 1);
    }
}