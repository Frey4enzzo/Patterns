package patterns.factory.abstractfactory;


public class PizzaTest {
    public static void main(String[] args) {


        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStrore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Леха заказал пиццу: " + pizza + "\n");


        pizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Ольга заказала пиццу: " + pizza);
    }
}
