package lectures.lecture12.exercises.exercise1;

public class E1_ShapesArea {

    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        Rectangle myRectangle = new Rectangle(8, 4);


        // information for circle object
        System.out.printf("The area of the Circle is: %.2f%n", myCircle.getArea());
        System.out.printf("The perimeter of the Circle is: %.2f%n", myCircle.getPerimeter());

        // information for rectangle object
        System.out.println("The area of the Rectangle is: " + myRectangle.getArea());
        System.out.println("The perimeter of the Rectangle is: " + myRectangle.getPerimeter());
    }
}
