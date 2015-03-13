package za.ac.cput.chapte51.behaviouraldesignpatterns.templatemethod;

/**
 * Created by student on 2015/03/09.
 */
public abstract class Transport {

    public abstract String start();
    public abstract String energySource();

    public final String ride() {

        String str = "Energy source: " + energySource();
        str += ", Start: " + start();
        return str;
    }
}
