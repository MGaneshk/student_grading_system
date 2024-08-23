import java.util.ArrayList;
import java.util.List;

public class GradingSystem {
    private List<Student> students;

    public GradingSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudentGrades() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Math Marks: " + student.getMathMarks());
            System.out.println("Science Marks: " + student.getScienceMarks());
            System.out.println("English Marks: " + student.getEnglishMarks());
            System.out.println("Total: " + student.calculateTotal());
            System.out.println("Percentage: " + student.calculatePercentage());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("------------------------");
        }
    }
}