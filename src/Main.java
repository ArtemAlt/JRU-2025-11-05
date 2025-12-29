import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /*
        try {
            ....
        } catch (тип ошибки) {
            что делать при ошибке
        }
         */

//        try {
//            int a = 10;
//            int b = 0;
//            int result = a / b;
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("На ноль делить нельзя");
//        }
//        System.out.println("Processing");

        /*
        try {
            ....
        } catch (тип ошибки) {
            что делать при ошибке
        } finally {
            после обработки ошибки
        }
         */


//        FileReader reader = null;
//        try {
//            reader = new FileReader("file.txt");
//            System.out.println("Reading file");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } finally {
//            System.out.println("Closing file");
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    System.out.println("Error closing file");
//                }
//            }
//            System.out.println("File closed");
//        }

//        try {
//            int a = 10;
//            int b = 0;
//            while (true) {
//
//            }
//            Exception
//        } catch (ArithmeticException e) {
//            System.out.println("Error");
//        } finally {
//            System.out.println("finally");
//        }
//        try {
//            readFile();
//        } catch (FileNotFoundException e) {
//
//        }

//        try {
//            readString(null);
//        } catch (NullPointerException e) {
//            System.out.println("Error: Null Pointer Exception");
//        }

//        String account = "64512164";
//        PaymentService service = new PaymentService();
//        try {
//            service.processing(account);
//        } catch (NotFoundAccount e) {
//            System.out.println("Account " + account + " not found");
//        }


//        RegisterService registerService = new RegisterService();
//
//        registerService.register("user1", "*********");
//        registerService.register("user2", "USER@mail.ru");
//
//        registerService.showAll();

//        try {
//            String str = null;
//            str.length();
//            int[] arr = {1, 2, 3};
//            System.out.println(arr[10]);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.fillInStackTrace());
//        } catch (NullPointerException e) {
//            System.out.println("NULL");
//        }


    }

    public static void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("file.txt");
    }

    public static void readString(String str) {
        str.length();
    }

    public static void rewriteFile(String fileName) {
        FileInputStream fis = null;
        BufferedReader reader = null;
        try {
            fis = new FileInputStream(fileName);
            reader = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
//            throw new SettingsFileReadExceptomn();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public static void rewriteFile2(String fileName) {
        /*
         try (*** ; *****) {
         }
         */
        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
            // UserListFileException()
        }
    }
}