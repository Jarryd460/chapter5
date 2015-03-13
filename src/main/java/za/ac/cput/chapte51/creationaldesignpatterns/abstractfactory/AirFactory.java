package za.ac.cput.chapte51.creationaldesignpatterns.abstractfactory;

/**
 * Created by student on 2015/03/08.
 */
public class AirFactory extends TransportFactory {

    public Machine getMachine(String type) {
        return new Aeroplane();
    }
}
