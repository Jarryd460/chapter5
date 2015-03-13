package za.ac.cput.chapte51.behaviouraldesignpatterns.visitor;

/**
 * Created by student on 2015/03/10.
 */
public class MovePart implements BodyMovement {

    @Override
    public String movePart(Body body) {
        return "Moving body ";
    }

    @Override
    public String movePart(Arms arms) {
        return "Moving arms ";
    }

    @Override
    public String movePart(Legs legs) {
        return "Moving legs ";
    }
}
