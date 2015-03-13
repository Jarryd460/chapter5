package za.ac.cput.chapte51.creationaldesignpatterns.abstractfactory;

/**
 * Created by student on 2015/03/08.
 */
public class AbstractFactory {

    public TransportFactory getTransportFactory(String type) {
        if(type.equalsIgnoreCase("Land")) {
            return new LandFactory();
        } else {
            return new AirFactory();
        }
    }
}
