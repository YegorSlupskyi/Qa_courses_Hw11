package src;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getPerimeter() {
        double circumference = 2 * radius * Math.PI;
        return circumference;
    }

    @Override
    public double getArea() {
        int power = 2;
        double area = Math.PI * Math.pow(radius, power);
        return area;
    }

    @Override
    public String getName(){
        return "Circle";
    }

}

