package patterns.factory.factorymethod;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "Нбю-Йоркская пицца пепперони";
        dough = "Тонкое тесто";
        sauce = "Секретный томатный соус";

        toppings.add("Помидоры черри");
        toppings.add("Секретный ингридиент");
    }
}
