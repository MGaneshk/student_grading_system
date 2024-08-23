public class Main {
    public static void main(String[] args) {
        GradingSystem gradingSystem = new GradingSystem();

        Student student1 = new Student("John Doe", 1, 80, 70, 90);
        Student student2 = new Student("Jane Doe", 2, 90, 80, 70);
        Student student3 = new Student("Bob Smith", 3, 70, 60, 80);

        gradingSystem.addStudent(student1);
        gradingSystem.addStudent(student2);
        gradingSystem.addStudent(student3);

        gradingSystem.displayStudentGrades();
    }
}