package patterns.factory.abstractfactory;


import patterns.factory.abstractfactory.ingredients.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();
    public Pepperoni createPepperoni();
    public Veggies[] createVeggies();
}
