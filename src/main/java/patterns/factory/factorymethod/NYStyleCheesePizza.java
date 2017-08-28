package patterns.factory.factorymethod;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "Нью-Йоркская пицца с сыром";
        dough = "На танком тесте";
        sauce = "Соус маринара";

        toppings.add("Сыр Российский");
    }
}
