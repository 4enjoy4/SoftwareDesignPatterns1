public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Create a circle
        Shape circle = factory.createShape("Circle");
        circle.draw();

        // Create a rectangle
        Shape rectangle = factory.createShape("Rectangle");
        rectangle.draw();
    }
}