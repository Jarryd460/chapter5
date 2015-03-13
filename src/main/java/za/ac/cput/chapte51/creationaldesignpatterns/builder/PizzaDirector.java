package za.ac.cput.chapte51.creationaldesignpatterns.builder;

/**
 * Created by student on 2015/03/08.
 */
public class PizzaDirector {

    private PizzaBuilder pizzaBuilder = null;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void makePizza() {
        pizzaBuilder.topping1();
        pizzaBuilder.topping2();
        pizzaBuilder.topping3();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
