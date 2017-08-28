package patterns.factory.factorymethod;


public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Чикагская пицца с сыром";
        dough = "На толстом тесте";
        sauce = "Томатный соус";

        toppings.add("Двойная моцарелла");
    }

    @Override
    void cut() {
        System.out.println("режем на квадратные куски");
    }
}
