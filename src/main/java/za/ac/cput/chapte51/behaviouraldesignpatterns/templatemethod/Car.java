package za.ac.cput.chapte51.behaviouraldesignpatterns.templatemethod;

/**
 * Created by student on 2015/03/09.
 */
public class Car extends Transport {

    @Override
    public String start() {
        return "Start car";
    }

    @Override
    public String energySource() {
        return "Petrol";
    }
}
