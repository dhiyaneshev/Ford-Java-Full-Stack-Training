package moreoninterfaces;

import java.util.Scanner;

interface ShapeInterface{
    double calculateArea();
}

class Shape implements ShapeInterface{
    protected String shapeName;

    public double calculateArea(){
        return 0.0;
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
}

class Square extends Shape{

    private int side;

    public double calculateArea(){
        return side*side;
    }

    public Square(int side) {
        super("Square");
        this.side = side;
    }
}

class Rectangle extends Shape{
    private int length;
    private int breadth;

    public double calculateArea(){
        return length*breadth;
    }

    public Rectangle(int length, int breadth) {
        super("Rectange");
        this.length = length;
        this.breadth = breadth;
    }
}

class Circle extends Shape{
    private int radius;

    public double calculateArea(){
        return radius*radius*3.14;
    }

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }
}

public class AreaOfAShape {
    public static void main(String[] args) {
        System.out.println("1. Rectangle\n" +
                "2. Square\n" +
                "3. Circle\n" +
                "Area Calculator --- Choose your shape\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter length and breadth:");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                Rectangle rectangle = new Rectangle(length,breadth);
                System.out.println("Area of Rectangle is: "+String.format("%.2f",rectangle.calculateArea()));
                break;
            case 2:
                System.out.println("Enter side: ");
                int side = sc.nextInt();
                Square square = new Square(side);
                System.out.println("Area of Square is: "+String.format("%.2f",square.calculateArea()));
                break;
            case 3:
                System.out.println("Enter Radius: ");
                int radius = sc.nextInt();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle is: "+String.format("%.2f",circle.calculateArea()));
                break;
            default:
                System.out.println("Invalid input: Input should be 1, 2 or 3 only.");
        }
    }
}
