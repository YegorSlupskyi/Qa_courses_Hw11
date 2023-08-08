package src.Tetragon;

public class Rectangle extends Tetragon{
    public Rectangle(double sideA, double sideB) {
        super(new Point(0, 0),
                new Point(0, sideA),
                new Point(sideB, sideA),
                new Point(sideB, 0));
    }

    @Override
    public double getArea() {
        return getSideA()* getSideB();
    }

    @Override
    public double getPerimeter() {
        return (getSideA()+ getSideB()) * 2;
    }
    public double getSideA() {
        return super.getTopSideLength();
    }
    public double getSideB() {
        return super.getLeftSideLength();
    }
    public double getAngle() {
        return 90.0;
    }

    @Override
    public String getName(){
        return "Rectangle";
    }
}
