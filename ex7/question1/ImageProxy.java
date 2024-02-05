public class ImageProxy implements IImage {
    private Image realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new Image(fileName);
        }
        realImage.display();
    }
}
