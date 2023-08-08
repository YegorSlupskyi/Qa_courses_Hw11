package src.Tetragon;

import src.Shape;

public class Tetragon extends Shape {
    private Point topLeft;
    private Point topRight;
    private Point bottomRight;
    private Point bottomLeft;

    public Tetragon(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomRight = bottomRight;
        this.bottomLeft = bottomLeft;
    }

    public double getPerimeter() {
        return getTopSideLength() + getBottomSideLength() + getLeftSideLength() + getRightSideLength();
    }

    public double getArea() {
        return 0.5 * Math.abs((topLeft.getX() * topRight.getY() +
                topRight.getX() * bottomRight.getY() +
                bottomRight.getX() * bottomLeft.getY() +
                bottomLeft.getX() * topLeft.getY()) -
                (topLeft.getY() * topRight.getX() +
                        topRight.getY() * bottomRight.getX() +
                        bottomRight.getY() * bottomLeft.getX() +
                        bottomLeft.getY() * topLeft.getX()));
    }

    public double getBottomLeftAngle() {
        double vectorAX = topLeft.getX() - bottomLeft.getX();
        double vectorAY = topLeft.getY() - bottomLeft.getY();
        double vectorBX = bottomRight.getX() - bottomLeft.getX();
        double vectorBY = bottomRight.getY() - bottomLeft.getY();
        double scalarProduct = vectorAX * vectorBX + vectorAY * vectorBY;
        return Math.toDegrees(Math.acos(scalarProduct / (getLeftSideLength() * getBottomSideLength())));
    }

    public double getTopLeftAngle() {
        double vectorAX = bottomLeft.getX() - topLeft.getX();
        double vectorAY = bottomLeft.getY() - topLeft.getY();
        double vectorBX = topRight.getX() - topLeft.getX();
        double vectorBY = topRight.getY() - topLeft.getY();
        double scalarProduct = vectorAX * vectorBX + vectorAY * vectorBY;
        return Math.toDegrees(Math.acos(scalarProduct / (getLeftSideLength() * getTopSideLength())));
    }

    public double getTopRightAngle() {
        double vectorAX = topLeft.getX() - topRight.getX();
        double vectorAY = topLeft.getY() - topRight.getY();
        double vectorBX = bottomRight.getX() - topRight.getX();
        double vectorBY = bottomRight.getY() - topRight.getY();
        double scalarProduct = vectorAX * vectorBX + vectorAY * vectorBY;
        return Math.toDegrees(Math.acos(scalarProduct / (getTopSideLength() * getRightSideLength())));
    }

    public double getBottomRightAngle() {
        double vectorAX = topRight.getX() - bottomRight.getX();
        double vectorAY = topRight.getY() - bottomRight.getY();
        double vectorBX = bottomLeft.getX() - bottomRight.getX();
        double vectorBY = bottomLeft.getY() - bottomRight.getY();
        double scalarProduct = vectorAX * vectorBX + vectorAY * vectorBY;
        return Math.toDegrees(Math.acos(scalarProduct / (getRightSideLength() * getBottomSideLength())));
    }

    public double getTopBottomDiagonal() {
        return topLeft.getDistance(bottomRight);
    }

    public double getBottomTopDiagonal() {
        return bottomLeft.getDistance(topRight);
    }

    public String toString() {
        return this.getTopSideLength() + "; "
                + this.getBottomSideLength() + "; "
                + this.getLeftSideLength() + "; "
                + this.getRightSideLength();
    }

    @Override
    public String getName(){
        return "Tetragon";
    }

    public double getTopSideLength() {
        return topLeft.getDistance(topRight);
    }

    public double getBottomSideLength() {
        return bottomLeft.getDistance(bottomRight);
    }

    public double getLeftSideLength() {
        return topLeft.getDistance(bottomLeft);
    }

    public double getRightSideLength() {
        return topRight.getDistance(bottomRight);
    }
}
