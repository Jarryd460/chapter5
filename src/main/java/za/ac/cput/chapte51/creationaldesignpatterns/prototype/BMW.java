package za.ac.cput.chapte51.creationaldesignpatterns.prototype;

/**
 * Created by student on 2015/03/09.
 */
public class BMW implements Prototype{

    private String model;

    public BMW(String model) {
        this.model = model;
    }

    @Override
    public Prototype copy() {
        return new BMW(model);
    }

    public String toString() {
        return "BMW model: " + model;
    }
}
