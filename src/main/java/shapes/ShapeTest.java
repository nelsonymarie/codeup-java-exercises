package shapes;

class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Box 1 area: " + box1.getArea()); // should return 20
        System.out.println("Box 1 perimeter: " + box1.getPerimeter()); // should return 18

        Rectangle box2 = new Square(5);
        System.out.println("Box 2 area: " + box2.getArea()); // should return 25
        System.out.println("Box 2 perimeter: " + box2.getPerimeter()); // should return 20
    }
}
