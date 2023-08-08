package src.Triangle;

public class RectangularTriangle extends Triangle {

    public RectangularTriangle(double cathetusA, double cathetusB) throws Exception {
        super(cathetusA, cathetusB, Math.sqrt(cathetusA * cathetusA + cathetusB * cathetusB));
    }

    public RectangularTriangle(double sideA, double sideB, double sideC) throws Exception {
        super(sideA, sideB, sideC);
        double hypotenuse;
        double cathetusA;
        double cathetusB;
        if (sideA > sideB && sideA > sideC) {
            hypotenuse = sideA;
            cathetusA = sideC;
            cathetusB = sideB;
        } else if (sideB > sideA && sideB > sideC) {
            hypotenuse = sideB;
            cathetusA = sideA;
            cathetusB = sideC;
        } else {
            hypotenuse = sideC;
            cathetusA = sideA;
            cathetusB = sideB;
        }
        if (hypotenuse * hypotenuse != cathetusA * cathetusA + cathetusB * cathetusB) {
            throw new Exception("This triangle isn't Rectangular");
        }
    }

    @Override
    public double getArea() {
        return (getCathetusA() * getCathetusB()) / 2.0;
    }

    public double getCathetusA() {
        return super.getSideA();
    }

    public double getCathetusB() {
        return super.getSideB();
    }

    public double getHypotenuse() {
        return super.getSideC();
    }

    @Override
    public double getAngleA() {
        return Math.toDegrees(Math.atan(getCathetusA() / getCathetusB()));
    }

    @Override
    public double getAngleB() {
        return 90.0 - this.getAngleA();
    }

    @Override
    public double getAngleC() {
        return 90.0;
    }

    @Override
    public String getName(){
        return "Rectangular Triangle";
    }

}
