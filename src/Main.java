import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) {
//        InputStream inputStream;
//        OutputStream outputStream;
//
//        Reader reader;
//        Writer writer;
//
//        InputStream is;
//        try {
//            is = new FileInputStream("photo.jpeg");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            is.closed();
//        }

//        try (InputStream is = new FileInputStream("photo.jpg");
//             OutputStream os = new FileOutputStream("copy.jpg")) {
//            byte[] buffer = new byte[4096];
//            int bytesRead;
//            while ((bytesRead = is.read(buffer)) != -1) {
//                os.write(buffer, 0, bytesRead);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getCause().getMessage());
//        }

//        try (Reader reader = new InputStreamReader(
//                new FileInputStream("text.txt"), StandardCharsets.UTF_8)) {
//            char[] buffer = new char[1024];
//            int charsRead;
//            while ((charsRead = reader.read(buffer)) != -1) {
//                String text = new String(buffer, 0, charsRead);
//                System.out.println(text);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getCause().getMessage());
//        }

//        try (InputStream is = new FileInputStream("data.gz");
//             BufferedInputStream bis = new BufferedInputStream(is);
//             GZIPInputStream gzip = new GZIPInputStream(bis);
//             InputStreamReader isr = new InputStreamReader(gzip, "UTF-8");
//             BufferedReader br = new BufferedReader(isr)) {
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (OutputStream os = new FileOutputStream("data.gz");
//                BufferedOutputStream bos = new BufferedOutputStream(os);
//                GZIPOutputStream gzip = new GZIPOutputStream(bos);
//                OutputStreamWriter osw = new OutputStreamWriter(gzip, "UTF-8");
//                BufferedWriter br = new BufferedWriter(osw)) {
//
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the file name: ");
//        String fileName = in.nextInt();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the file name: ");
//        try {
//            String fileName = br.readLine();
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }

//        try(BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
//            writer.write("Hello, World!");
//            writer.flush();
//            writer.write("Hello, World!");
//            writer.flush();
//            writer.write("Hello, World!");
//            writer.flush();
//            writer.write("Hello, World!");
//            writer.flush();
//        } catch (IOException ex) {
//
//        }
//
//        try(PrintWriter pw = new PrintWriter( new BufferedWriter(new FileWriter("log.txt")))) {
//            pw.println("Hello, World!");
//            pw.print("Hello, World!");
//
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }



    }
}