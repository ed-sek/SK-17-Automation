package lectures.lecture11.exercises.exercise1;

public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double displayCalculatedArea() {
        double rectangleArea = length * width;
        return rectangleArea;
    }

    // override the default toString method to get meaningful output
    @Override
    public String toString() {
        return "Rectangle with width " + width + " and length " + length;
    }
}
