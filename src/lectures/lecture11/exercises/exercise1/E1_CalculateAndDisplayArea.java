package lectures.lecture11.exercises.exercise1;

public class E1_CalculateAndDisplayArea {

    public static void main(String[] args) {

        Shape myCircle = new Circle(18);
        Shape myRectangle = new Rectangle(8, 6);

        System.out.println("The calculated area of " + myCircle + " is: " + myCircle.displayCalculatedArea());
        System.out.println("The calculated area of " + myRectangle + " is: " + myRectangle.displayCalculatedArea());
    }
}
