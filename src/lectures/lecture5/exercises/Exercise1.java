package lectures.lecture5.exercises;

public class Exercise1 {

    public static void main(String[] args) {

        biggestNum();
    }

    // find the biggest number in given array
    static void biggestNum() {
        int[] arr = {12, 8, 753, 431, 17, 530, 60 ,75};
        int biggestNum = arr[0]; // initialize to first item in array instead of 0 to capture neg values correctly

        for (int number : arr) {
            if (number>biggestNum) {
                biggestNum = number;
            }
        }
        System.out.println(biggestNum);
    }
}
