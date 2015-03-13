package za.ac.cput.chapte51.behaviouraldesignpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/10.
 */
public class Dealer {
    private List<Car> carList = new ArrayList<Car>();

    public void add(Car car) {
        carList.add(car);
    }

    public Car getCar(int index) {
        return carList.get(index);
    }
}
