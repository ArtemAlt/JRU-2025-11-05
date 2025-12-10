
public class Main {
    public static void main(String[] args) {
//        final int WIDTH = 800;
//        WIDTH = 900;
//        final Rectangle rectangle = new Rectangle(150, 200);
//        rectangle.info();
//        rectangle.width = WIDTH;
//        rectangle.info();
//        rectangle = new Rectangle(150);

//        StudentGroup sg = new StudentGroup();
//
//        Student s = new Student("Ivan", 20);
//        Student s1 = new Student("Nikovay", 18);
//        Student s2 = new Student("Sofya", 19);
//        Student s3 = new Student("Artem", 21);
//
//        sg.addStudent(s);
//        sg.addStudent(s1);
//        sg.addStudent(s2);
//        sg.addStudent(s3);

//        sg.groupInfo();

//        Student[] students = sg.getStudents();
//        Student hacker = new Student("Hacker", 22);
//        students[0] = hacker;
//        sg.groupInfo();
//        System.out.println("===========");
//        for (Student student : students) {
//            System.out.println(student.info());
//        }
//        Computer com = new Computer("CPU", 2000, "Nvidia", "Win", 500, "I700", true);

//        new Computer.Builder("I7")
//                .withCpu("CPU")
//                .withMemory(2000)
//                .withPower(500)
//                .build();

        BankAccount bankAccount1 = new BankAccount("Ivanov", "IV2", 500);
        BankAccount bankAccount2 = new BankAccount("Petrov", "PE2");

        BankAccount.transfer(bankAccount1, bankAccount2, 200);
        System.out.println(bankAccount1.info());
        System.out.println(bankAccount2.info());

        BankAccount.transfer(bankAccount1, bankAccount2, 200);
        System.out.println(bankAccount1.info());
        System.out.println(bankAccount2.info());

        BankAccount.transfer(bankAccount1, bankAccount2, 200);
        System.out.println(bankAccount1.info());
        System.out.println(bankAccount2.info());
    }
}