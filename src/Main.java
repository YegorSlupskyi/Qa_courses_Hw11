package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Shape> shapeList = new ArrayList<>();
        int shapeId;
        Shape shapeToAdd = null;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            printListOfShapes();
            do {
                shapeId = scanner.nextInt();
                if (shapeId <= 0 || shapeId >= 12) {
                    System.out.println("There is no shape with this id!");
                }
            } while (shapeId <= 0 || shapeId >= 12);

            switch (shapeId) {
                case 1 -> {
                    shapeToAdd = CreateShape.createTetragonFromKeyboard(scanner);
                }

                case 2 -> {
                    shapeToAdd = CreateShape.createParallelogramFromKeyboard(scanner);
                }

                case 3 -> {
                    shapeToAdd = CreateShape.createTrapeziumFromKeyboard(scanner);
                }

                case 4 -> {
                    shapeToAdd = CreateShape.createRhombusFromKeyboard(scanner);
                }

                case 5 -> {
                    shapeToAdd = CreateShape.createRectangleFromKeyboard(scanner);
                }

                case 6 -> {
                    shapeToAdd = CreateShape.createSquareFromKeyboard(scanner);
                }
                case 7 -> {
                    shapeToAdd = CreateShape.createTriangleFromKeyboard(scanner);
                }

                case 8 -> {
                    shapeToAdd = CreateShape.createRectangularTriangleFromKeyboard(scanner);
                }
                case 9 -> {
                    shapeToAdd = CreateShape.createEquilateralTriangleFromKeyboard(scanner);
                }
                case 10 -> {
                    shapeToAdd = CreateShape.createIsoscelesTriangleFromKeyboard(scanner);
                }
                default -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    shapeToAdd = new Circle(radius);
                }
            }
            shapeList.add(shapeToAdd);
            System.out.println("Do you wanna add one more shape? Yes/No");
            String usersAnswer = scanner.next();
            if (!usersAnswer.equalsIgnoreCase("yes")) {
                break;
            }
        }
        Collections.sort(shapeList);
        System.out.println("============= Figure list: ===============");
        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println(i + 1 + ". [" + shapeList.get(i).getName()
                    + "]: Area = " + shapeList.get(i).getArea()  + "сm²"
                    + " Perimeter = " + shapeList.get(i).getPerimeter() + "сm");
        }

    }

    public static void printListOfShapes() {
        System.out.println("What shape would you like to add to the collection?");
        System.out.println("1 - Tetragon");
        System.out.println("2 - Parallelogram");
        System.out.println("3 - Trapezium");
        System.out.println("4 - Rhombus");
        System.out.println("5 - Rectangle");
        System.out.println("6 - Square");
        System.out.println("7 - Triangle");
        System.out.println("8 - Rectangular Triangle");
        System.out.println("9 - Equilateral Triangle");
        System.out.println("10 - Isosceles Triangle");
        System.out.println("11 - Circle");
        System.out.print("Your selected shape id: ");
    }


}