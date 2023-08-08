package src.Triangle;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double side, double foundation) throws Exception {
        super(side, side, foundation);
    }

    public IsoscelesTriangle(double sideA, double sideB, double sideC) throws Exception {
        super(sideA, sideB, sideC);
        if (sideA != sideB && sideA != sideC && sideB != sideC) {
            throw new Exception("This triangle isn't Isosceles");
        }
    }

    @Override
    public double getArea() {
        return (getSide() * getSide() * Math.sin(Math.toRadians(getMainAngle()))) / 2;
    }

    public double getSideAngle() {
        return super.getAngleA();
    }

    public double getMainAngle() {
        return super.getAngleC();
    }

    public double getSide() {
        return super.getSideA();
    }

    public double getFoundation() {
        return super.getSideC();
    }

    @Override
    public String getName(){
        return "Isosceles Triangle";
    }

}
