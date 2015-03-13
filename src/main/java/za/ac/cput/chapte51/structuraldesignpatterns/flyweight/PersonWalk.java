package za.ac.cput.chapte51.structuraldesignpatterns.flyweight;

/**
 * Created by student on 2015/03/09.
 */
public class PersonWalk implements Person {

    String move;

    public PersonWalk() {
        move = "Walk";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String move() {
        return "Person: " + move;
    }
}
