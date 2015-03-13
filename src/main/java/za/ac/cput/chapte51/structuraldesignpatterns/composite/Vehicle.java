package za.ac.cput.chapte51.structuraldesignpatterns.composite;

/**
 * Created by student on 2015/03/09.
 */
public class Vehicle implements Component {

    String car;

    public Vehicle(String car) {
        this.car = car;
    }

    @Override
    public String accelerate() {
        return car + " accelerating";
    }

    @Override
    public String brake() {
        return car + " braking";
    }
}
