package src;

public abstract class Shape implements Comparable<Shape> {
    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract String getName();

    @Override
    public int compareTo(Shape otherShape) {
        double areaDifference = this.getArea() - otherShape.getArea();
        if (areaDifference > 0) {
            return -1;
        } else if (areaDifference < 0) {
            return 1;
        }
        double perimeterDifference = this.getPerimeter() - otherShape.getPerimeter();
        if (perimeterDifference > 0) {
            return -1;
        } else if (perimeterDifference < 0) {
            return 1;
        }
        return 0;
    }

}
