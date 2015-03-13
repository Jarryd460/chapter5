package za.ac.cput.chapte51.behaviouraldesignpatterns.observer;

/**
 * Created by student on 2015/03/12.
 */
public class Student2 implements Lecturer {

    @Override
    public String announce(String msg) {
        return "Student2: " + msg + "\n";
    }
}
