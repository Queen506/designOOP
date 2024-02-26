public class VectorImageSaver implements ImageVisitor {
    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Saving the circle... with radius= " + circle.getRadius() + " at position "
                + circle.getxPos() + ", " + circle.getyPos() + " as vector");
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out
                .println("Saving the triangle...with base = " + triangle.getBase() + " height = " + triangle.getHeight()
                        + " at position " + triangle.getxPos() + ", " + triangle.getyPos() + " as vector");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println(
                "Saving the rectangle...with width = " + rectangle.getWidth() + " height = " + rectangle.getHeight()
                        + " at position " + rectangle.getxPos() + ", " + rectangle.getyPos() + " as vector");
    }
}
