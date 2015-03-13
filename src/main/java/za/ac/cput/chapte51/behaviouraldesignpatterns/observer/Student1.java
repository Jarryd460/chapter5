package za.ac.cput.chapte51.behaviouraldesignpatterns.observer;

/**
 * Created by student on 2015/03/12.
 */
public class Student1 implements Lecturer {

    @Override
    public String announce(String msg) {
        return "Student1: " + msg + "\n";
    }
}
