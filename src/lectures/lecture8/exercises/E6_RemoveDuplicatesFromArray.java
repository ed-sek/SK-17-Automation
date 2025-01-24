package lectures.lecture8.exercises;

import java.util.Arrays;

import java.util.HashSet;

public class E6_RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arrayWithDuplicates = {163, 96, 503, 297, 20, 503, 472, 963, 66, 472};
        System.out.println("The array with duplicate numbers is: " + Arrays.toString(arrayWithDuplicates));


        int[] uniqueArray = removeDuplicatesFromArrayAndReturnUniques(arrayWithDuplicates);

        System.out.println("\nThe array with unique numbers is: " + Arrays.toString(uniqueArray));
    }

    // removes duplicates from an int array and returns only uniques
    static int[] removeDuplicatesFromArrayAndReturnUniques(int[] inputArray) {
        HashSet<Integer> uniqueSet = new HashSet<>();

        // populating the HashSet to remove duplicates
        for (int num : inputArray) {
            uniqueSet.add(num);
        }

        // declaring int[] array equal tp HashSet size
        int[] uniqueArr = new int[uniqueSet.size()];

        int index = 0;
        for (Integer element : uniqueSet) {
            uniqueArr[index] = element;
            index++;
        }
        return uniqueArr;
    }
}



