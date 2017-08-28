package patterns.factory.factorymethod;


public class PizzaTestDrive {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza;

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Алексей заказал пиццу: " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ольга заказала пиццу: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Иван заказал пиццу: " + pizza.getName() + "\n");
    }
}
