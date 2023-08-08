package src;

import src.Tetragon.*;
import src.Triangle.EquilateralTriangle;
import src.Triangle.IsoscelesTriangle;
import src.Triangle.RectangularTriangle;
import src.Triangle.Triangle;

import java.util.Scanner;

public class CreateShape {
    public static Tetragon createTetragonFromKeyboard(Scanner scanner) {
        System.out.println("Enter coordinates (x,y) for the point 1: ");
        System.out.print("x1= ");
        double x1 = scanner.nextDouble();
        System.out.print("y1= ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates (x,y) for the point 2: ");
        System.out.print("x2= ");
        double x2 = scanner.nextDouble();
        System.out.print("y2= ");
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates (x,y) for the point 3: ");
        System.out.print("x3= ");
        double x3 = scanner.nextDouble();
        System.out.print("y3= ");
        double y3 = scanner.nextDouble();

        System.out.println("Enter coordinates (x,y) for the point 4: ");
        System.out.print("x4= ");
        double x4 = scanner.nextDouble();
        System.out.print("y4= ");
        double y4 = scanner.nextDouble();

        return new Tetragon(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }

    public static Parallelogram createParallelogramFromKeyboard(Scanner scanner) {
        System.out.println("Enter sides A and B of the Parallelogram: ");
        System.out.print("sideA= ");
        double sideA = scanner.nextDouble();

        System.out.print("sideB= ");
        double sideB = scanner.nextDouble();

        System.out.println("Enter angle between sides of the Parallelogram: ");
        System.out.print("angle°= ");
        double angle = scanner.nextDouble();

        return new Parallelogram(sideA, sideB, Math.toRadians(angle));
    }

    public static Trapezium createTrapeziumFromKeyboard(Scanner scanner) {
        do {
            System.out.println("Enter coordinates (x,y) for the point 1: ");
            System.out.print("x1= ");
            double x1 = scanner.nextDouble();
            System.out.print("y1= ");
            double y1 = scanner.nextDouble();

            System.out.println("Enter coordinates (x,y) for the point 2: ");
            System.out.print("x2= ");
            double x2 = scanner.nextDouble();
            System.out.print("y2= ");
            double y2 = scanner.nextDouble();

            System.out.println("Enter coordinates (x,y) for the point 3: ");
            System.out.print("x3= ");
            double x3 = scanner.nextDouble();
            System.out.print("y3= ");
            double y3 = scanner.nextDouble();

            System.out.println("Enter coordinates (x,y) for the point 4: ");
            System.out.print("x4= ");
            double x4 = scanner.nextDouble();
            System.out.print("y4= ");
            double y4 = scanner.nextDouble();

            Trapezium shapeToAdd = null;
            try {
                shapeToAdd = new Trapezium(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            return shapeToAdd;
        } while (true);
    }

    public static Rhombus createRhombusFromKeyboard(Scanner scanner) {
        System.out.println("Enter side of the Rhombus: ");
        System.out.print("side= ");
        double side = scanner.nextDouble();

        System.out.println("Enter angle between sides of the Rhombus: ");
        System.out.print("angle°= ");
        double angle = scanner.nextDouble();

        return new Rhombus(side, Math.toRadians(angle));
    }

    public static Rectangle createRectangleFromKeyboard(Scanner scanner) {
        System.out.println("Enter sides A and B of the Rectangle: ");
        System.out.print("sideA= ");
        double sideA = scanner.nextDouble();

        System.out.print("sideB= ");
        double sideB = scanner.nextDouble();
        return new Rectangle(sideA, sideB);
    }

    public static Square createSquareFromKeyboard(Scanner scanner) {
        System.out.println("Enter side of the Square: ");
        System.out.print("side= ");
        double side = scanner.nextDouble();

        return new Square(side);
    }

    public static Triangle createTriangleFromKeyboard(Scanner scanner) {
        do {
            System.out.println("Enter sides A, B and C of the Triangle: ");
            System.out.print("sideA= ");
            double sideA = scanner.nextDouble();

            System.out.print("sideB= ");
            double sideB = scanner.nextDouble();

            System.out.print("sideB= ");
            double sideC = scanner.nextDouble();
            Triangle shapeToAdd = null;

            try {
                shapeToAdd = new Triangle(sideA, sideB, sideC);
                ;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            return shapeToAdd;
        } while (true);
    }

    public static RectangularTriangle createRectangularTriangleFromKeyboard(Scanner scanner) {
        do {
            System.out.println("Enter cathetus A and cathetus B of the Triangle: ");
            System.out.print("cathetusA= ");
            double cathetusA = scanner.nextDouble();

            System.out.print("cathetusB= ");
            double cathetusB = scanner.nextDouble();

            RectangularTriangle shapeToAdd = null;

            try {
                shapeToAdd = new RectangularTriangle(cathetusA, cathetusB);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            return shapeToAdd;

        } while (true);

    }

    public static EquilateralTriangle createEquilateralTriangleFromKeyboard(Scanner scanner) {

        do {
            System.out.println("Enter side of the Equilateral Triangle: ");
            System.out.print("side= ");
            double side = scanner.nextDouble();

            EquilateralTriangle shapeToAdd = null;

            try {
                shapeToAdd = new EquilateralTriangle(side);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            return shapeToAdd;

        } while (true);
    }

    public static IsoscelesTriangle createIsoscelesTriangleFromKeyboard(Scanner scanner) {

        do {
            System.out.println("Enter side and foundation of the Isosceles Triangle: ");
            System.out.print("side= ");
            double side = scanner.nextDouble();

            System.out.print("foundation= ");
            double foundation = scanner.nextDouble();

            IsoscelesTriangle shapeToAdd = null;

            try {
                shapeToAdd = new IsoscelesTriangle(side, foundation);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            return shapeToAdd;

        } while (true);
    }

}
