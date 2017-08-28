package patterns.factory.factorymethod;

/**
 *  типичный фабричный метод
 *  abstract Product factoryMethod(String type)
 *  Фабричный метод определяет интерфейс создания объекта,
 *  но позволяет субклассам выбрать класс создаваемого экземпляра.
 *  Таким образом, Фабричный Метод делигирует операцию
 *  создания экземпляра субклассам.
 */

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // фабричный абстрактный метод
    abstract Pizza createPizza(String type);
}
