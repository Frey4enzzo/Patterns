package patterns.factory.factorymethod;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Чикагская вегитарианская пицца";
        dough = "Толстое тесто";
        sauce = "Соус из огурцов";

        toppings.add("Всякие дополнительные овощи");
    }

    @Override
    void cut() {
        System.out.println("Режем на прямоугольные куски");
    }
}
