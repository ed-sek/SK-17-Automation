package lectures.lecture2.exercises;

public class E3_PrintTriangleArea {

    public static void main(String[] args) {
        areaTriangle();
    }

    // print the area of a triangle with given sides
    public static void areaTriangle() {
        int base = 6;
        int height = 8;
        int hypotenuse = 10;
        int area = (base * height) / 2;
        System.out.println(area);
    }
}
