package za.ac.cput.chapte51.behaviouraldesignpatterns.iterator;

/**
 * Created by student on 2015/03/10.
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " +  age;
    }
}
