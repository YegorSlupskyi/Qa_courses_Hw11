package src.Tetragon;

public class Point {
    private double x;
    private double y;


    public double getDistance(Point rightPoint) {
        return Math.sqrt(Math.pow(rightPoint.getX() - this.getX(), 2) + Math.pow(rightPoint.getY() - this.getY(), 2));
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
