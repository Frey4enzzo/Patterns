package patterns.factory.factorymethod;


public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "Нью-Йоркская вегетаприанская пицца";
        dough = "Тоненькое тесто";
        sauce = "Вегитарианский соус из баклажанов";

        toppings.add("Огурчики");
        toppings.add("Помидорчики");
        toppings.add("Перчик");
    }
}
