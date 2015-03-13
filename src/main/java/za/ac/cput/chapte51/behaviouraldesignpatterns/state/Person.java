package za.ac.cput.chapte51.behaviouraldesignpatterns.state;

/**
 * Created by student on 2015/03/10.
 */
public class Person implements Action {

    Action action;

    public Person(Action action) {
        this.action = action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String move() {
        return action.move();
    }
}
