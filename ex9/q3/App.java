import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<ImageElement> shapes = new ArrayList<>();
		shapes.add(new Circle(5.5, 200, 100));
		shapes.add(new Triangle(4, 5, 500, 1000));
		shapes.add(new Rectangle(6, 8, 400, 720));

		ImageVisitor vectorSaver = new VectorImageSaver();
		ImageVisitor rasterSaver = new RasterImageSaver();

		for (ImageElement shape : shapes) {
			shape.accept(vectorSaver);
		}

		System.out.println("--------------");

		for (ImageElement shape : shapes) {
			shape.accept(rasterSaver);
		}
	}
}
