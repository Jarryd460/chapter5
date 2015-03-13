package za.ac.cput.chapte51.behaviouraldesignpatterns.mediator;

/**
 * Created by student on 2015/03/10.
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return Speak.hello(name);
    }

    public String sayGoodbye() {
        return Speak.goodbye(name);
    }
}
