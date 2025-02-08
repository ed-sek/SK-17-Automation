package lectures.lecture05.exercises;

public class E5_PrintAllNumbersExceptThoseDivisibleBy3 {

    public static void main(String[] args) {

        printFilteredNumbers();
    }

    // print all numbers except those divisible by 3
    static void printFilteredNumbers() {
        int[] array = {545, 470, 25, 956, 219, 678, 81, 46, 319, 729};

        for (int number : array) {
            if (number % 3 == 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}



