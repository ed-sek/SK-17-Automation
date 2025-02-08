package lectures.lecture12.exercises.exercise1;

public class Rectangle implements Shape {
    int legth;
    int width;

    public Rectangle(int legth, int width) {
        this.legth = legth;
        this.width = width;
    }

    public double getArea() {
        double rectangleArea = legth * width;
        return rectangleArea;

    }

    public double getPerimeter() {
        double rectanglePerimeter = 2 * (legth + width);
        return rectanglePerimeter;
    }
}
