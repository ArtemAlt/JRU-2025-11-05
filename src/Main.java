
public class Main {
    public static void main(String[] args) {

//        String s1 = "string";
//
//        String s2 = new String("string"); //private final char value[];
//        //private final byte[] value;

//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = new String("Hello");
//        String s4 = new String("Hello").intern();

//        System.out.println("s1 == s2 " + (s1 == s2));
//        System.out.println("s1 == s3 " + (s1 == s3));
//        System.out.println("s1 == s4 " + (s1 == s4));

//        System.out.println("equals s1 s3 " + s1.equals(s3));
//
//        String origin = "Java";
//        String modif = origin.toUpperCase();
//        System.out.println("origin " + origin);
//        System.out.println("modif " + modif);

//        boolean isEquals = "HELLO".equalsIgnoreCase("hello");
//        System.out.println(isEquals);

//        int banana = "apple".compareTo("banana");
//        int apple = "banana".compareTo("apple");
//        System.out.println(banana);
//        System.out.println(apple);

//        String urlS = "https://www.example.com";
//        String url = "http://www.example.com";
//
//        boolean https = urlS.startsWith("https");
//        boolean http = url.startsWith("https");
//        System.out.println(https);
//        System.out.println(http);

//        String email = "example@google.com";
//        String emailCorp = "example@sber.ru";
//        boolean b = emailCorp.endsWith("sber.ru");
//        System.out.println(b);
//        String sentence = "Java is a popular programming language";
//        System.out.println("Содержит 'Java': " + sentence.contains("Java")); // true
//        System.out.println("Содержит '': " + sentence.contains("")); // true
//        String email = "user@example.c";
//        boolean isValid =  email.contains("@") && (email.endsWith(".com") || email.endsWith(".ru"));
//        System.out.println(isValid);

//        String text = "Java is fun. Java is powerful. Java is everywhere.";
//        int firstJava = text.indexOf("Java");
//        System.out.println("Первое вхождение 'Java': позиция " + firstJava); //
//
//        int secondJava = text.indexOf("Java", firstJava + 1);
//        System.out.println("Второе вхождение 'Java': позиция " + secondJava); //
//
//        int lastJava = text.lastIndexOf("Java");
//        System.out.println("Последнее вхождение 'Java': позиция " + lastJava);

//        String phone = "123-456-7890";
//        boolean isPhoneFormat = phone.matches("\\d{3}-\\d{3}-\\d{4}");
//        System.out.println("Телефон в правильном формате: " + isPhoneFormat);

//        String fullName = "Иван Иванов";
//        String firstName = fullName.substring(0, 4);
//        String lastName = fullName.substring(5);
//        System.out.println(lastName);

//        String csv = "яблоко,апельсин,банан,киви";
//        String[] fruits = csv.split(",");
//        System.out.println("Фрукты:");
//        for (String fruit : fruits) {
//            System.out.println("- " + fruit);
//        }
//
//        String joined = String.join(" | ", fruits);
//        System.out.println("Объединённые фрукты: " + joined);

//        String withSpaces = "   Hello Java   ";
//        System.out.println("До trim: '" + withSpaces + "'");
//        System.out.println("После trim: '" + withSpaces.trim() + "'");

//        String message = "Я люблю Java. Java это круто!";
//        String updated = message.replace("Java", "Python");
//        System.out.println("Замена: " + updated);
//
//        String withDigits = "Цена: 100 рублей, скидка: 20%";
//        String withoutDigits = withDigits.replaceAll("\\d+", "XX");
//        System.out.println(withoutDigits);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello World");
//        System.out.println(sb);
//        sb.append(" Its me");
//        System.out.println(sb);
//        StringBuilder builder = new StringBuilder("Hello");
//        // append() - добавление в конец
//        builder.append(" World");
//        System.out.println("После append: " + builder); // "Hello World"
//
//        // insert() - вставка в позицию
//        builder.insert(5, " Java");
//        System.out.println("После insert: " + builder); // "Hello Java World"
//
//        // delete() - удаление части
//        builder.delete(5, 10);
//        System.out.println("После delete: " + builder); // "Hello World"
//
//        // replace() - замена части
//        builder.replace(6, 11, "Java");
//        System.out.println("После replace: " + builder); // "Hello Java"
//
//        builder.reverse();
//        System.out.println("После reverse: " + builder);

//        long startTime = System.currentTimeMillis();

//        String result = "";
//        for (int i = 0; i < 10000; i++) {
//            result += i + ", ";
//        }
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");
//
//        startTime = System.currentTimeMillis();

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 10000; i++) {
//            sb.append(i).append(", ");
//        }
//        String efficientResult = sb.toString();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");


    }
}