public class Main {

    public static void main(String[] args) {

        System.out.println(
                "До создания объектов: "
                        + Circle.getNumberOfObjects()
        );

        Circle c1 = new Circle();

        Circle c2 = new Circle(5);

        Circle c3 = new Circle(10);

        System.out.println(
                "\nКоличество объектов: "
                        + Circle.getNumberOfObjects()
        );

        Circle[] circles = new Circle[3];

        circles[0] = c1;
        circles[1] = c2;
        circles[2] = c3;

        double maxArea = circles[0].getArea();

        Circle maxCircle = circles[0];

        System.out.println(
                "\nРадиусы и площади кругов:"
        );

        for (Circle c : circles) {

            System.out.println(
                    "Радиус: "
                            + c.getRadius()
                            + " | Площадь: "
                            + c.getArea()
            );

            if (c.getArea() > maxArea) {

                maxArea = c.getArea();

                maxCircle = c;
            }
        }

        System.out.println(
                "\nКруг с максимальной площадью:"
        );

        System.out.println(
                "Радиус: "
                        + maxCircle.getRadius()
        );

        System.out.println(
                "Площадь: "
                        + maxCircle.getArea()
        );
    }
}