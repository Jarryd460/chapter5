package za.ac.cput.chapte51.creationaldesignpatterns.builder;

/**
 * Created by student on 2015/03/08.
 */
public interface PizzaBuilder {
    public abstract void topping1();
    public abstract void topping2();
    public abstract void topping3();
    public abstract Pizza getPizza();
}
