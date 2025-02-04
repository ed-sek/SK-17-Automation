package lectures.lecture12.exercises.exercise1;

public class Circle implements Shape {
    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        double circleArea = (radius * radius) * Math.PI;
        return circleArea;

    }

    public double getPerimeter() {
        double circlePerimeter = radius * Math.PI * 2;
        return circlePerimeter;
    }
}
