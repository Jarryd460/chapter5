package za.ac.cput.chapte51.behaviouraldesignpatterns.state;

/**
 * Created by student on 2015/03/10.
 */
public class Danger implements Action {

    @Override
    public String move() {
        return "RUN!";
    }
}
