class InheritanceA {
    // 1. Declare required variables
    // 2. Create the parameterized method for Circle Area
    InheritanceA(){

    }
    public void findCircleArea(float rad) {
        // your code here
        System.out.println("The area of the circle is: "+3.14*rad*rad+" cm square");
    }
}

class InheritanceB extends InheritanceA {
    // 1. Declare required variables
    // 2. Create the parameterized method for Rectangle Area

    public InheritanceB() {

    }

    public void findRectangleArea(int l, int b) {
        // your code here
        System.out.println("The area of the rectangle is: "+l*b+" cm square");
    }
}

public class ShapeAreas extends InheritanceB {
    // 1. Declare required variables
    // 2. Create the parameterized method for triangle Area

    public ShapeAreas() {

    }

    public void findTriangleArea(int b, int h) {
        System.out.println("The area of the triangle is: "+0.5*b*h+" cm square");
    }
    public static void main(String[] args) {
        // 3. Create object and call required methods
        System.out.println("************Inheritance A***************");
        InheritanceA circle1 = new InheritanceA();
        circle1.findCircleArea(5);

        System.out.println("************Inheritance B***************");
        InheritanceB circle2 = new InheritanceB();
        InheritanceB rectangle1 = new InheritanceB();
        circle2.findCircleArea(7);
        rectangle1.findRectangleArea(3,4);

        System.out.println("************ShapeAreas***************");
        ShapeAreas circle3 = new ShapeAreas();
        ShapeAreas rectangle2 = new ShapeAreas();
        ShapeAreas triangle1 = new ShapeAreas();
        circle3.findCircleArea(8);
        rectangle2.findRectangleArea(6,8);
        triangle1.findTriangleArea(3,4);
    }
}
