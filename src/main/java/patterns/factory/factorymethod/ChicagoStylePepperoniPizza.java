package patterns.factory.factorymethod;

public class ChicagoStylePepperoniPizza extends Pizza{

    public ChicagoStylePepperoniPizza() {
        name = "Чикагская пепперони пицца";
        dough = "Толстенное тесто";
        sauce = "Секретный чикагский соус пепперони";

        toppings.add("Дополнительные помидоры");
    }

    @Override
    void cut() {
        System.out.println("Режем пиццу овалами, чисто для прикола");
    }
}
