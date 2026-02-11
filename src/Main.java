
public class Main {
    public static void main(String[] args) {
//
//        Tatiana tatiana = new Tatiana();
//
//        Georgiy georgiy = new Georgiy();
//        Document document = tatiana.writeDocument();
//        Document document1 = georgiy.writeDocument();
//
//        tatiana.log("Hello");
//
//        System.out.println(document);
//        System.out.println(document1);


//        PaymentValidator pv = new PositivePaymentValidator();
//
//        PaymentValidator pv1 = new PaymentValidator() {
//            @Override
//            public boolean validate(Payment payment) {
//                return true;
//            }
//        };
//
//        PaymentValidator pv2 = p ->  true;

//        PaymentValidator pv3 = PaymentUtils::isValid;



//        PaymentProcessor pp = new PaymentProcessor(p -> p.getAmount() > 0);
//        Payment payment = new Payment(100);
//        pp.process(payment);
//
        Payment payment2 = new Payment(-100);
//        pp.process(payment2);

        PaymentValidator composite = PaymentValidator.notNull()
                .and(p -> p.getAmount() > 0)
                .and(p -> p.getAmount() != 1000)
                .or(p -> p.getAmount() < 100000000);

        PaymentProcessor pp2 = new PaymentProcessor(composite);

        pp2.process(payment2);
    }

    public static void audit(Object obj) {
        if (obj instanceof Auditable) {
            Tatiana tatiana = (Tatiana) obj;
        }
    }
}