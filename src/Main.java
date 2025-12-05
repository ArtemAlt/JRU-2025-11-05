
public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Vasya", 25);
//        System.out.println(person.getFullInfo());

//        Person person1 = new Person("Ivan", -525);
//        System.out.println(person1.getFullInfo());

//        int x = 10;

//        person1.setName(null);
//        System.out.println(person1.getFullInfo());
//        int x = 10;
//        System.out.println("* " + x);
//        change(x);
//        System.out.println("** " + x);

//        Cat cat = new Cat("Barsik", 3);
//        System.out.println("* " + cat.getInfo());
//        change(cat);
//        System.out.println("** " + cat.getInfo());

//        Cat cat1 = new Cat("Барсик", 3);
//        Cat cat2 = new Cat("Рыжик", 5);
//        System.out.println(cat1.getInfo());
//        System.out.println(cat2.getInfo());
//        swap(cat1,cat2);
//        System.out.println("SW - " + cat1.getInfo());
//        System.out.println("SW - " + cat2.getInfo());


        Library lib = new Library();

        Author lev = new Author("Л. Толстой", "Россия");
        Author bred = new Author("Р. Брэдбери", "США");

        Book book1 = new Book("Война и мир", lev, 1863, 1750);
        Book book2 = new Book("Вино из одуванчиков", bred, 1957, 488);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.showAllBooks();
//
//        Book byTitle = lib.findBookByTitle("Война и мир");
//        System.out.println(byTitle);
//        System.out.println(byTitle.info());

        Book noBook = lib.findBookByTitle("dsfgsdfg");
        System.out.println(noBook);
        System.out.println(noBook.info());





    }

    public static void change(int i) {
        System.out.println("IN method- " + i);
        i++;
        System.out.println("OUT method - " + i);
    }

    public static void change(Cat cat) {
        System.out.println("IN method- " + cat.getInfo());
        cat.setName("Pushok");
        System.out.println("OUT method - " + cat.getInfo());
    }

    public static void swap(Cat a, Cat b) {
        Cat temp = a;
        a = b;
        b = temp;
        System.out.println("A - " + a.getInfo());
        System.out.println("B - " + b.getInfo());
    }
}