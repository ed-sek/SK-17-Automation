package lectures.lecture06.exercises;

public class E2_PrintMultiDimensionalArray {

    public static void main(String[] args) {

        printMultiDimensionalArray();
    }

    // print 2-d matrix array (4x3)
    static void printMultiDimensionalArray() {
        int[][] multiArray = {
                {85, 231, 602},
                {965, 993, 23},
                {753, 115, 471},
                {84, 112, 308}
        };

        // using a nested for-loop
        for (int row = 0; row < multiArray.length; row++) {
            System.out.println("The current row is: " + row);

            for (int column = 0; column < multiArray[row].length; column++) {
                System.out.println("The current column is: " + multiArray[row][column]);
            }
            System.out.println("__________"); // prettify output
        }
    }
}

