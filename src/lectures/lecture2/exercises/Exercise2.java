package lectures.lecture2.exercises;

public class Exercise2 {

    public static void main(String[] args) {
        perimeter();
    }

    // print the perimeter of triangle with given sides
    public static void perimeter() {
        int sideA = 3;
        int sideB = 5;
        int sideC = 2;
        int perim = sideA + sideB + sideC;
        System.out.println(perim);
    }
}

