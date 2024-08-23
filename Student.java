public class Student {
    private String name;
    private int rollNo;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public Student(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public double calculateTotal() {
        return mathMarks + scienceMarks + englishMarks;
    }

    public double calculatePercentage() {
        return (calculateTotal() / 300) * 100;
    }

    public String getGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}