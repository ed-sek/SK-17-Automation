package lectures.lecture06.exercises;

public class E1_PrintArraySum {

    public static void main(String[] args) {

        printArraySum();
    }

    // print sum of given array elements
    static void printArraySum() {
        int[] array = {611, 73, 446, 956, 789, 26, 220, 91, 752, 217};
        int sum = 0;

        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);
    }
}
