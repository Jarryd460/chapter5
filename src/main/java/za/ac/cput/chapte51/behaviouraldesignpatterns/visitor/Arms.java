package za.ac.cput.chapte51.behaviouraldesignpatterns.visitor;

/**
 * Created by student on 2015/03/10.
 */
public class Arms implements BodyPart {

    @Override
    public String move(BodyMovement bodyMovement) {
        return bodyMovement.movePart(this);
    }
}
