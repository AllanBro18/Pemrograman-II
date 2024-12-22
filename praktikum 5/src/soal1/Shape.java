package soal1;

public abstract class Shape {
    String shapeName;

    public Shape(String n) {
        this.shapeName = n;
    }
    public abstract double area();

    public String toString() {
        return shapeName;
    };
}

class Sphere extends Shape {
    double radius;

    Sphere(double r) {
        super("Sphere");
        this.radius = r;
    }

    @Override
    public double area() {
        return 4 * Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double r, double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}