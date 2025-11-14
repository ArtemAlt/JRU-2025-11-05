
public class Main {
    public static void main(String[] args) {
    /*
        если условие = верное
            то делай вот это
            иначе делай другое
     */

      /*
        if (светофор == зеленый) {
            ехать;
        } else {
            жадть;
        }
       */
//        int age = 18;
//
//        if (age < 19) {
//            System.out.println("Слишком юн");
//        }
//
//        if (age <= 18) System.out.println("Слишком юн");

//        int temp = 9;
//        if (temp < 10) {
//            System.out.println("Одеть шапку");
//            System.out.println("Взять шарф");
//        } else {
//            System.out.println("Взять очки");
//        }

//        int score = 85;
//        String gared;
//
//        if (score >= 90) {
//            gared = "A";
//        } else if (score >= 80) {
//            gared = "B";
//        } else if (score >= 70) {
//            gared = "C";
//        } else {
//            gared = "D";
//        }
//        System.out.println(gared);

//        int score = 85;
//        String gared;
//
//        if (score >= 70) {
//            gared = "A";
//        } else if (score >= 80) {
//            gared = "B";
//        } else if (score >= 90) {
//            gared = "C";
//        } else {
//            gared = "D";
//        }
//        System.out.println(gared);
//
//        int a = 10, b = 20;
//
//        System.out.println(a == b);  // false - равно
//        System.out.println(a != b);  // true  - не равно
//        System.out.println(a < b);   // true  - меньше
//        System.out.println(a > b);   // false - больше
//        System.out.println(a <= b);  // true  - меньше или равно
//        System.out.println(a >= b);  // false - больше или равно
//
//
//        int age = 15;
//
//        if (age >= 65) {
//            System.out.println("Пенсионер");
//        } else {
//            if (age >= 18) {
//                System.out.println("Взрослый");
//            } else {
//                if (age >= 14) {
//                    System.out.println("Подросток");
//                } else {
//                    System.out.println("Ребенок");
//                }
//            }
//        }


//        int age2 = 18;
//        boolean isAdult = (age2 >= 18);
//        System.out.println(isAdult);
//
//        //Может ли человек ехать на машине
//        boolean hasDriverLisense = true;
//        boolean hasCar = true;
//
//        if (hasDriverLisense) {
//            System.out.println("Может водить");
//        }
//        if (hasDriverLisense && hasCar) {
//            System.out.println("Можем ехать на своей машине");
//        } else {
//            System.out.println("Каршеринг");
//        }
//
//        boolean a1 = true, b1 = false;
//
//        System.out.println(a1 && b1);  // false - И   true И true   false И true
//        System.out.println(a1 || b1);  // true  - ИЛИ
//        System.out.println(!a1);      // false - НЕ

        //Провести валидацию логина и пароля пользователя
//        String userName = "user123";
//        String password = "password123";
//
//        boolean isUserNameValid = userName != null && userName.length() >= 4;
//        boolean isPasswordValid = password != null && password.length() >= 6;
//
//        if (isUserNameValid && isPasswordValid) {
//            System.out.println("Можно логиниться");
//        } else {
//            System.out.println("Reject");
//        }

//        //Проверка доступности контента
//        int userAge = 17;
//        boolean isPermission = false;
//
//        if (userAge >= 18 || (userAge < 18 && isPermission)) {
//            System.out.println("Доступ к контенту есть");
//        } else {
//            System.out.println("Отказать");
//        }
        /*

        int x = 5, y = 10, z = 15;

        // Без скобок - по приоритету
           boolean result1 = x < y && y < z;    // true && true = true
            boolean result2 = x > y || y < z;    // false || true = true
            boolean result3 = !x > y && y < z;   // !false && true = true && true = true

        // Со скобками - явное указание порядка
            boolean result4 = (x < y) && (y < z);           // true
            boolean result5 = (x > y) || (y < z);           // true
            boolean result6 = !(x > y) && (y < z);          // true

        // Сложные выражения
            boolean complex1 = x > 0 && y > 0 || z > 0;     // (true && true) || true = true
            boolean complex2 = x > 0 && (y > 0 || z > 0);   // true && (true || true) = true
            boolean complex3 = !(x > y) && y != z;          // true && true = true
         */
//
//        String ageCategory = getAgeCategory(200);
//        System.out.println("ВОЗРАСТ - " + ageCategory);
//
//        // Тернарный оператор
//        int age22 = 20;
//        String status = (age22 >= 18) ? "взрослый" : "ребенок";
//        System.out.println("STATUS - " + status);
//
//        String message = (age >= 65) ? "Пенсионер" :
//                (age >= 18) ? "Взрослый" : "Ребенок";

        //Сравнение строк
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

    }


    static String getAgeCategory(int age) {
        if (age < 0 || age >= 100) return "Неверный возраст";
        if (age >= 65) return "Пенсионер";
        if (age >= 18) return "Взрослый";
        if (age >= 13) return "Подросток";
        return "Ребенок";
    }


}