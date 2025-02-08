package lectures.lecture05.exercises;

public class E6_CalculateAverageOfGivenList {

    public static void main(String[] args) {

        calculateAverage();
    }

    // print average of a given list
    static void calculateAverage() {
        int[] array = {302, 431, 96, 880, 14, 834, 47, 828, 899, 44};
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        double avgNum = (double) sum / array.length; // casting to double to capture the decimal

        System.out.println(avgNum);
    }
}
