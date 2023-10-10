public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
