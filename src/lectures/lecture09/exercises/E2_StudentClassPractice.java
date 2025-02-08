package lectures.lecture09.exercises;

public class E2_StudentClassPractice {

    private static final String LINE_SEPARATOR = "============";

    public static void main(String[] args) {
        double[] johnGrades = {5.1, 4.2, 5.65};
        Student john = new Student("John", johnGrades);
        double[] maryGrades = {3.1, 4.8, 5.25};
        Student mary = new Student("Mary", maryGrades);
        double[] stanGrades = {3.68, 3.3, 5.4};
        Student stan = new Student("Stand", stanGrades);


        System.out.println(john.getStudentDetails());
        System.out.println(LINE_SEPARATOR);
        System.out.println(mary.getStudentDetails());
        System.out.println(LINE_SEPARATOR);
        System.out.println(stan.getStudentDetails());
    }
}




