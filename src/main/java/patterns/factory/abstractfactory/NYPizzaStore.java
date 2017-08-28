package patterns.factory.abstractfactory;


public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaInredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Пицца с сыром по Нью-Йоркски");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Вегитарианская пицца по Нью-Йоркски");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Пицца с морепродуктами по Нью-Йоркски");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Пицца пепперони по Нью-Йоркски");
        }

        return pizza;
    }
}
