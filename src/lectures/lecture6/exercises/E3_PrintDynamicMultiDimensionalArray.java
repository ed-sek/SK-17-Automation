package lectures.lecture6.exercises;

import java.util.Scanner;

public class E3_PrintDynamicMultiDimensionalArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        printDynamicMultiDimensionalArray();

        sc.close();
    }

    // print 2-d matrix array with rows/columns taken by input
    static void printDynamicMultiDimensionalArray() {

        int[][] multiArray = {
                {209, 538, 122, 458, 835},
                {916, 187, 471, 654, 974},
                {742, 12, 643, 75, 334},
                {874, 537, 47, 603, 736}
        };

        System.out.println("I can printout the item in a 4x5 array when given the row and column value.\nPlease enter the row number [1-4]: ");
        int userRow = sc.nextInt();

        while (!((userRow>=1)&&(userRow<=4))) {
            System.out.println("Selected value outside of valid range [1-4].\nPlease try again: ");
            userRow = sc.nextInt();
        }

        System.out.println("Please enter the column number [1-5]: ");
        int userColumn = sc.nextInt();

        while (!((userColumn>=1)&&(userColumn<=5))) {
            System.out.println("Selected value outside of valid range [1-5].\nPlease try again: ");
            userColumn = sc.nextInt();
        }

        System.out.println("The item on your selected position is: " + multiArray[userRow-1][userColumn-1]);
    }
}
