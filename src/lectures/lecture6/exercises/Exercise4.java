package lectures.lecture6.exercises;

public class Exercise4 {

    public static void main(String[] args) {

        findBiggestElement();
    }

    // find the biggest element and print
    static void findBiggestElement() {

        String[] cars = {"Bentley", "Audi", "Lamborghini", "Volvo", "Chevrolet", "Kia"};
        String biggestElement = ""; // initialize empty String

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].length()>biggestElement.length()) {
                biggestElement = cars[i];
            }
        }
        System.out.println("The biggest element in the array is " + biggestElement);
    }
}
