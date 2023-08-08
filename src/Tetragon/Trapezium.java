package src.Tetragon;

public class Trapezium extends Tetragon {
    public Trapezium(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) throws Exception {
        super(topLeft, topRight, bottomRight, bottomLeft);
        double v1X = (topRight.getX() - topLeft.getX());
        double v1Y = (topRight.getY() - topLeft.getY());
        double v2X = (bottomRight.getX() - bottomLeft.getX());
        double v2Y = (bottomRight.getY() - bottomLeft.getY());
        double v3X = (topLeft.getX() - bottomLeft.getX());
        double v3Y = (topLeft.getY() - bottomLeft.getY());
        double v4X = (topRight.getX() - bottomRight.getX());
        double v4Y = (topRight.getY() - bottomRight.getY());

        double v1v2Z = v1X * v2Y - v2X * v1Y;
        double v3v4Z = v3X * v4Y - v4X * v3Y;

        if ( Math.sqrt(v1v2Z * v1v2Z) != 0 && Math.sqrt(v3v4Z * v3v4Z) != 0) {
            throw new Exception(" This tetragon is not a Trapezium");
        }
    }

    @Override
    public String getName(){
        return "Trapezium";
    }
}
