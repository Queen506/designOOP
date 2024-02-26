public interface ImageVisitor {
    void visitCircle(Circle circle);

    void visitTriangle(Triangle triangle);

    void visitRectangle(Rectangle rectangle);
}