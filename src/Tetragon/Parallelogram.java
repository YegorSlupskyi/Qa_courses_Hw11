package src.Tetragon;

public class Parallelogram extends Tetragon {
    public Parallelogram(double sideA, double sideB, double angleBetweenSides) {
        super(new Point(0, 0),
                new Point(sideA * Math.cos(angleBetweenSides), sideA * Math.sin(angleBetweenSides)),
                new Point(sideA * Math.cos(angleBetweenSides) + sideB, sideA * Math.sin(angleBetweenSides)),
                new Point(sideB, 0));
    }
    @Override
    public double getArea() {
        return getTopSideLength() * getLeftSideLength() * (Math.sin(Math.toRadians(getTopLeftAngle())));
    }

    @Override
    public double getPerimeter() {
        return (getSideA() + getSideB()) * 2;
    }

    public double getSideA() {
        return super.getTopSideLength();
    }

    public double getSideB() {
        return super.getLeftSideLength();
    }
    public double getSideD() {
        return super.getBottomSideLength();
    }
    public double getSideC() {
        return super.getRightSideLength();
    }

    @Override
    public String getName(){
        return "Parallelogram";
    }

}
