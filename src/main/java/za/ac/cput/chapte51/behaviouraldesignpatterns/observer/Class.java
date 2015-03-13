package za.ac.cput.chapte51.behaviouraldesignpatterns.observer;

/**
 * Created by student on 2015/03/12.
 */
public interface Class {

    public abstract boolean addStudent(Lecturer lecturer);
    public abstract boolean removeStudent(Lecturer lecturer);
    public abstract String announce();
}
