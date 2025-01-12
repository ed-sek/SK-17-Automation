package lectures.lecture5.exercises;

public class Exercise4 {

    public static void main(String[] args) {

        findMultipleOf5();
    }

    // find the first multiple of 5
    static void findMultipleOf5() {
        int[] array = {858, 519, 601, 257, 28, 30, 481, 635, 141, 563};

        for(int num : array) {
            if (num%5==0) {
                System.out.println(num);
                break;
            }
        }
    }
}
