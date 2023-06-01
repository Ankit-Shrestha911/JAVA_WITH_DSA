public class Interface {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.5);
        c1.draw();
        System.out.printf("%.2f\n",c1.getArea());

    }
}

interface Drawable extends Information {
    void draw();
}

interface Information {
    double getArea();
}

class Circle implements Drawable {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    public void draw() {
        System.out.println("Drawing circle.");
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
