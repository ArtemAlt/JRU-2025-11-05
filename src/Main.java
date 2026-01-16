import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IOException {

//        FileInputStream fis = new FileInputStream("file.txt");
//        int bytesRead;
//        while ((bytesRead = fis.read()) != -1) {
//            System.out.println((char) bytesRead);
//        }
//
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("data.txt")));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }

//        Path path = new File("./path.txt").toPath();
//        Path path2 = Paths.get("new_path.txt");
//        List<String> strings = Files.readAllLines(path);
//        for (String s : strings) {
//            System.out.println(s);
//        }
//        Path path1 = Path.of("file1.txt");
//        Paths.get("file2.txt");
//        Path path4 = Path.of("C:\\Users\\file.txt");
//        Path path3 = Path.of("/home/user/docs");
//        String separator = File.separator;
//        C:\Documents\JUR-2025-11-05\src\123.txt
//        /home/user/JUR-2025-11-05/src/123.txt
//        path.getParent(); // папка где лежит файл
//        path.getFileName();
//        path.getRoot();
//        path.getNameCount();

//        Files.createDirectory(Path.of("new", "new1", "new2", "new3"));

//        myMethod(new String[]{"1", "2", "3"});
//        myMethod1("1", "2", "3");

//        Files.createFile(Path.of("src/1234.txt"));

//        List<String> strings = Files.readAllLines(Path.of("src/123.txt"));
//        for(String s : strings) {
//            System.out.println(s);
//        }

//        Files.writeString(Path.of("src/123.txt"),"Hello World");

//        Files.write(Path.of("src/123.txt"), Arrays.asList("kjdghskgj", "sdfsddf", "bxzjcugdu"),
//                StandardOpenOption.CREATE, StandardOpenOption.APPEND);

//        Path path = Path.of("src/123.txt");
//
//        System.out.println("Is file: " + Files.exists(path));
//        System.out.println("Is file: " + Files.isRegularFile(path));
//        System.out.println("Is dir: " + Files.isDirectory(path));
//        System.out.println("Is file: " + Files.isReadable(path));
//        System.out.println("Is file: " + Files.isWritable(path));
//        System.out.println("File size: " + Files.size(path));
//        System.out.println("File modified time: " + Files.getLastModifiedTime(path));

//        try (Stream<Path> list = Files.list(Paths.get("."))){
//            list.forEach(System.out::println);
//        }

//        Stream<Path> pathStream = Files.find(Paths.get("."),
//                Integer.MAX_VALUE,
//                (p, a) -> p.toString().endsWith(".txt"));
//        pathStream.forEach(System.out::println);

//        String property = System.getProperty("user.home");
//        System.out.println("Property: " + property);


    }


//    public static void myMethod(String[] arg) {
//
//    }

//    public static void myMethod1(String ... arg) {
//        arg[1] = "";
//    }

}