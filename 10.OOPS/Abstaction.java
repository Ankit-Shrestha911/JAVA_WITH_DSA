public class Abstaction {
    public static void main(String[] args) {
        
        Circle c1 = new Circle("red", 3);
        System.out.println(c1.getArea());
        System.out.println(c1.getColor());
        System.out.println(c1.getPerimeter());

        System.out.println();

        Rectangle r1 = new Rectangle("blue", 3, 5);
        System.out.println(r1.color);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

    }
}

 


abstract class Shape {
    protected String color;

    Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}

class Circle extends Shape {
    private double radius;;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

}
