package src.Triangle;

import src.Shape;

public class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB) {
            throw new Exception("This triangle does not exist");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getAngleA() {
        return Math.toDegrees(Math.acos((getSideB() * getSideB() + getSideC() * getSideC() - getSideA() * getSideA()) / (2 * getSideB() * getSideC())));
    }

    public double getAngleB() {
        return Math.toDegrees(Math.acos((getSideA() * getSideA() + getSideC() * getSideC() - getSideB() * getSideB()) / (2 * getSideA() * getSideC())));
    }

    public double getAngleC() {
        return Math.toDegrees(Math.acos((getSideA() * getSideA() + getSideB() * getSideB() - getSideC() * getSideC()) / (2 * getSideA() * getSideB())));
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - getSideA()) * (halfPerimeter - getSideB()) * (halfPerimeter - getSideC()));
    }

    public String toString() {
        return this.getSideA() + "; "
                + this.getSideB() + "; "
                + this.getSideC();
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    @Override
    public String getName(){
        return "Triangle";
    }

}
