package za.ac.cput.chapte51.structuraldesignpatterns.proxy;

/**
 * Created by student on 2015/03/09.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        return realImage.display();
    }
}
