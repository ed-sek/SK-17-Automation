package lectures.lecture08.exercises;

import java.util.ArrayList;

import java.util.Random;


public class E5_FindSecondLargestNumberInArray {

    static Random random = new Random();

    public static void main(String[] args) {

        ArrayList<Integer> numbersArrayToCheck = random10NumGenerator();

        int secondLargestNumFromRandomArray = findTheSecondLargestNumberInArray(numbersArrayToCheck);

        System.out.println("The second largest number from: " + numbersArrayToCheck + "\nis: " + secondLargestNumFromRandomArray);
    }

    // finds the largest integer from an ArrayList input
    static int findTheSecondLargestNumberInArray(ArrayList<Integer> inputArray) {

        // validate the array has at least 2 elements
        if (inputArray.size() < 2) {
            System.out.println("The array must contain at least two numbers to find the second largest.");
            return 1;
        }

        // initializing the largest num and the secondLargest num to the first and second positions
        int largestNum = inputArray.get(0);
        int secondLargestNum = inputArray.get(1);

        // if second element is bigger than first, then swap
        if (largestNum < secondLargestNum) {
            secondLargestNum = largestNum;
            largestNum = inputArray.get(1);
        }

        // iterate through the array starting from third element updating the largest and second largest
        for (int i = 2; i < inputArray.size(); i++) {
            if (inputArray.get(i) > largestNum) {
                secondLargestNum = largestNum;
                largestNum = inputArray.get(i);
            } else if (inputArray.get(i) > secondLargestNum) {
                secondLargestNum = inputArray.get(i);
            }
        }
        return secondLargestNum;
    }

    // generates 10 random integers range 1-999
    static ArrayList<Integer> random10NumGenerator() {
        ArrayList<Integer> randomIntegers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randomIntegers.add(random.nextInt(999) + 1); // the +1 shifts the entire range up by one
        }
        return randomIntegers;
    }
}



