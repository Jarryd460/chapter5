package za.ac.cput.chapte51.structuraldesignpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/09.
 */
public class CarList implements Component {

    List<Component> components = new ArrayList<Component>();

    @Override
    public String accelerate() {
        for(Component component : components) {
            component.accelerate();
        }
        return null;
    }

    @Override
    public String brake() {
        for(Component component : components) {
            component.brake();
        }
        return null;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int index) {
        return components.get(index);
    }
}
