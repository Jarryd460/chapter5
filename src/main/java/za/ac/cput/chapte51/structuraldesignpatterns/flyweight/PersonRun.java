package za.ac.cput.chapte51.structuraldesignpatterns.flyweight;

/**
 * Created by student on 2015/03/09.
 */
public class PersonRun implements Person {

    String move;

    public PersonRun() {
        move = "Run";
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String move() {
        return "Person: " + move;
    }
}
