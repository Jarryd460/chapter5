package za.ac.cput.chapte51.structuraldesignpatterns.bridge;

/**
 * Created by student on 2015/03/09.
 */
public abstract class Shape {

    protected Draw draw;

    protected Shape(Draw draw) {
        this.draw = draw;
    }

    public abstract String draw();
}
