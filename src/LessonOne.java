
public class LessonOne {
    public static void main(String[] args) {
        //Вывод в консоль
        System.out.println("Привет!");
        System.out.println("Артем");
        System.out.println("-----------");
        System.out.print("Новый привет! ");
        System.out.println("Василий");

        //Переменные
        int a;
        float f;
        double d;
        char c;
        boolean b;
        String s;

        //Инициализация Переменные
        int a1 = 1;
        float f1 = 2.0f;
        double d1 = 3.12;
        char c1 = 'c';
        boolean b2 = true;
        String s3 = "My String";

        //Имена Переменные
        int count = 1;
        long l1 = 7864385763847534l;
        byte bb = 0;
        short bbb = 0;
        float price = 2.0f;
        double sum = 3.12;
        char firstCharName = 'c';
        boolean isOpen = true;
        String name = "My String";

        //Математика
        int aa = 3;
        int bb4 = 4;
//        System.out.println(aa / bb);


        int cc = 5;
        cc++;
        cc++;
        cc++;
        cc++;
        System.out.println(cc);

        int vv = 9;
        vv--;
        vv--;
        vv--;
        vv--;
        System.out.println(vv);

        // Строки
        String myName = "Name", mySurname = "My Surname", age = "30";
        System.out.println(myName + " " + age);

        System.out.println(myName + vv);
        System.out.println(1 + 2);
        System.out.println(1 + "2");
        System.out.println(1 + 3 + "5" + 5);

        //Преобразование строки в число
        String rrr = "123";
        int i = Integer.parseInt(rrr);
        System.out.println(i + 1);

        String bad = "123r";
//        int ii = Integer.parseInt(bad);
//        System.out.println(ii + 1);

        //Перевод объекта в строку
        double dddd = 97345986.54556;
        boolean bbb5 = true;
        long l2 = 456457678987456l;
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Значение - " + String.valueOf(dddd));
        System.out.println("Значение - " + String.valueOf(bbb5));
        System.out.println("Значение - " + String.valueOf(l2));
        System.out.println("Значение - " + String.valueOf(arr));

        //Методы строк
        /*
        Многострочный
        комментарий
         */
        String dogName = "AlaSka";
        System.out.println(dogName.length());
        System.out.println(dogName.toLowerCase());
        System.out.println(dogName.toUpperCase());
    }
}