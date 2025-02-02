package lectures.lecture11.exercises.exercise1;

public class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double displayCalculatedArea() {
        double circleArea = (radius * radius) * 3.14;
        return circleArea;
    }

    // override the default toString method to get meaningful output
    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
