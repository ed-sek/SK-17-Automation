package lectures.lecture5.exercises;

public class Exercise2 {

    public static void main(String[] args){

        divisibleBy5();
    }

    static void divisibleBy5() {
        int[] list1 = {12,15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int item : list1) {
            if (item>150) {
                return;
            } else if (item%5==0) { // double equals-sign for comparison, single for assignment
                System.out.println(item);
            }
        }
    }
}
