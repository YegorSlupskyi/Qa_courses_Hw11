package src.Triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) throws Exception {
        super(side, side, side);
    }

    public EquilateralTriangle(double sideA, double sideB, double sideC) throws Exception {
        super(sideA, sideB, sideC);
        if (sideA < sideB && sideA < sideC && sideB < sideA && sideB < sideC && sideC < sideA && sideC < sideB) {
            throw new Exception("This triangle is not Equilateral");
        }
    }

    @Override
    public double getArea() {
        return (getSide() * getSide() * Math.sqrt(3)) / 4;
    }

    public double getAngle() {
        return 60;
    }

    public double getSide() {
        return super.getSideA();
    }

    @Override
    public String getName(){
        return "Equilateral Triangle";
    }
}


