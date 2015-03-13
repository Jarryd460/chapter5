package za.ac.cput.chapte51.creationaldesignpatterns.builder;

/**
 * Created by student on 2015/03/08.
 */
public class SouthAfricanPizza implements PizzaBuilder {

    private Pizza pizza;

    public SouthAfricanPizza() {
        pizza = new Pizza();
    }

    @Override
    public void topping1() {
        pizza.setTopping1("Steak");
    }

    @Override
    public void topping2() {
        pizza.setTopping2("Cheese");
    }

    @Override
    public void topping3() {
        pizza.setTopping3("Gherkins");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
