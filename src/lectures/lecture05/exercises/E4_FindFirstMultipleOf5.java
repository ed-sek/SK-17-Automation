package lectures.lecture05.exercises;

public class E4_FindFirstMultipleOf5 {

    public static void main(String[] args) {

        findMultipleOf5();
    }

    // find the first multiple of 5
    static void findMultipleOf5() {
        int[] array = {858, 519, 601, 257, 28, 30, 481, 635, 141, 563};

        for (int number : array) {
            if (number % 5 == 0) {
                System.out.println(number);
                break;
            }
        }
    }
}
