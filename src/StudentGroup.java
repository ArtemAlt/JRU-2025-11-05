public class StudentGroup {
    private final Student[] students = new Student[50];
    private int count = 0;

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Student group fill");
        }
    }

    public Student[] getStudents() {
        Student[] copy = new Student[count];
        for (int i = 0; i < count; i++) {
            copy[i] = students[i];
        }
        return copy;
    }

    public void groupInfo() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].info());
        }
    }
}
