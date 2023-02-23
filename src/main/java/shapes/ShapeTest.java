package shapes;

//class ShapesTest {
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Box 1 area: " + box1.getArea()); // should return 20
//        System.out.println("Box 1 perimeter: " + box1.getPerimeter()); // should return 18
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Box 2 area: " + box2.getArea()); // should return 25
//        System.out.println("Box 2 perimeter: " + box2.getPerimeter()); // should return 20
//    }
//}


//package shapes;


public class ShapeTest {

    public static void main(String[] args) {

        // declare a variable of the type Measurable named myShape
        Square myShape;

        // create a rectangle with length of 5 units and width of 10 units
        myShape = new Square(5, 10);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());

        // create a square with side length of 7 units
        myShape = new Square(7, 10);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());

    }

}










