package patterns.factory.abstractfactory;

import patterns.factory.abstractfactory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Onion(), new Spinach(), new EggPlant(), new BlackOlives()};
        return veggies;
    }
}
