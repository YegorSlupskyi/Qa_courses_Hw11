package src.Tetragon;

public class Square extends Tetragon {
    public Square(double side) {
        super(new Point(0, 0),
                new Point(0, side),
                new Point(side, side),
                new Point(side, 0));
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(),2);
    }

    @Override
    public double getPerimeter() {
        return  getTopSideLength()*4 ;
    }

    public double getSide() {
        return super.getTopSideLength();
    }

    public double getAngle() {
        return 90.0;
    }

    @Override
    public String getName(){
        return "Square";
    }
}
