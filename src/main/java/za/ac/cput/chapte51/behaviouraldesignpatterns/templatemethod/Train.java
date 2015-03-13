package za.ac.cput.chapte51.behaviouraldesignpatterns.templatemethod;

/**
 * Created by student on 2015/03/09.
 */
public class Train extends Transport {

    @Override
    public String start() {
        return "Turbines on";
    }

    @Override
    public String energySource() {
        return "Coal";
    }
}
