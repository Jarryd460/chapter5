package za.ac.cput.chapte51.structuraldesignpatterns.proxy;

/**
 * Created by student on 2015/03/09.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public String display() {
        return "Displaying " + fileName;
    }

    private String loadFromDisk(String fileName) {
        return "Loading " + fileName;
    }
}
