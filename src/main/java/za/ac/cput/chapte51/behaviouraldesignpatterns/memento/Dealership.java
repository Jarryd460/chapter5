package za.ac.cput.chapte51.behaviouraldesignpatterns.memento;

/**
 * Created by student on 2015/03/10.
 */
public class Dealership {

    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car car() {
        return new Car(manufacturer);
    }

    public void getCar(Car car) {
        manufacturer = car.getManufacturer();
    }
}
