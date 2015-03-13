package za.ac.cput.chapte51.structuraldesignpatterns.bridge;

/**
 * Created by student on 2015/03/09.
 */
public class SmallRectangle implements Draw{

    @Override
    public String drawRectangle(int height, int width) {
        return "Height: " + height + " Width: " + width;
    }
}
