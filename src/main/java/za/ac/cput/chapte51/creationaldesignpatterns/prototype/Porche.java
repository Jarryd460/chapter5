package za.ac.cput.chapte51.creationaldesignpatterns.prototype;

/**
 * Created by student on 2015/03/09.
 */
public class Porche implements Prototype {

    private String model;

    public Porche(String model) {
        this.model = model;
    }

    @Override
    public Prototype copy() {
        return new Porche(model);
    }

    public String toString() {
        return "Porche model: " + model;
    }
}
