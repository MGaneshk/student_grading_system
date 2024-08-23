The system consists of two classes: Student and GradingSystem.

Student Class:

Attributes:
name: String (student's name)
rollNo: int (student's roll number)
mathMarks: int (student's math marks)
scienceMarks: int (student's science marks)
englishMarks: int (student's english marks)
Methods:
calculateTotal(): calculates the total marks of the student
calculatePercentage(): calculates the percentage of the student based on the total marks
getGrade(): determines the grade of the student based on the percentage (A, B, C, D, or F)
GradingSystem Class:

Attributes:
students: List<Student> (list of students in the system)
Methods:
addStudent(Student student): adds a student to the system
displayStudentGrades(): displays the grades of all students in the system
Main Class:

The Main class is the entry point of the program. It creates instances of Student and adds them to the GradingSystem. Finally, it calls the displayStudentGrades() method to display the grades of all students.

How it Works:

The Student class represents a student with attributes like name, roll number, math marks, science marks, and english marks.
The GradingSystem class represents the grading system and has a list of students.
The addStudent() method adds a student to the system.
The displayStudentGrades() method iterates through the list of students and calls the calculateTotal(), calculatePercentage(), and getGrade() methods to calculate and display the grades of each student.
The Main class creates instances of Student and adds them to the GradingSystem.
Finally, the displayStudentGrades() method is called to display the grades of all students.
Advantages:

The system is modular and easy to maintain.
The Student class encapsulates the attributes and behavior of a student.
The GradingSystem class provides a centralized way to manage and display the grades of all students.
The system is scalable and can be easily extended to add more features or students.
Limitations:

The system does not handle errors or invalid input.
The system does not provide a way to update or delete student records.
The system does not provide a way to sort or filter students based on their grades.
