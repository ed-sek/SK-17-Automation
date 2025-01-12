package lectures.lecture5.exercises;

import java.util.Arrays; // imports Arrays class to use array manipulation methods

public class Exercise3 {

    public static void main(String[] args) {

        reverseList();
    }

    // reverse an array
    static void reverseList() {
        int[] list1 = {10, 20, 30, 40, 50};
        int[] reversedList = new int[5];
        int counter = list1.length-1; // setting to last index of array

        for (int i=0; i<list1.length; i++) {
            reversedList[i] = list1[counter];
            counter--;
        }
        System.out.println(Arrays.toString(reversedList));
    }
}


