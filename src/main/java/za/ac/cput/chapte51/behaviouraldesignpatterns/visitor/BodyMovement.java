package za.ac.cput.chapte51.behaviouraldesignpatterns.visitor;

/**
 * Created by student on 2015/03/10.
 */
public interface BodyMovement {
    public abstract String movePart(Body body);
    public abstract String movePart(Arms arms);
    public abstract String movePart(Legs legs);
}
