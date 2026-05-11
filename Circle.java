public class Circle {

    double radius;

    static int numberOfObjects = 0;

    public Circle() {

        radius = 1.0;

        numberOfObjects++;
    }

    public Circle(double radius) {

        this.radius = radius;

        numberOfObjects++;
    }

    public double getArea() {

        return radius * radius * Math.PI;
    }

    public double getRadius() {

        return radius;
    }

    public static int getNumberOfObjects() {

        return numberOfObjects;
    }
}