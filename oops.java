
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0.0;
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}


public class oops{
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Color: " + circle.getColor());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Color: " + rectangle.getColor());

        circle.setColor("Green");
        System.out.println("New Circle Color: " + circle.getColor());
    }
}


