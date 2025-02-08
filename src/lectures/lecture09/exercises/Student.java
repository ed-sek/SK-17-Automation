package lectures.lecture09.exercises;

public class Student {

    private String name;
    private double[] grades;

    public Student(String studentName, double[] studentGrades) {
        this.name = studentName;
        this.grades = studentGrades;
    }

    public double averageGrades() {
        if (grades.length == 0) {
            System.out.println("The grades array cannot be empty. Please fill and try again");
            return -1;
        }

        double sum = 0.0;
        for (double grade : this.grades) {
            sum += grade;
        }
        double userGrades = sum / this.grades.length;
        return userGrades;
    }

    public String getStudentDetails() {
        return "The student's name is: " + this.name + ". Average grades are: " + this.averageGrades();
    }
}
