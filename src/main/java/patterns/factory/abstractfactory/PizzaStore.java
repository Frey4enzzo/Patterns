package patterns.factory.abstractfactory;


/**
 * Абстрактная Фабрика - интерфейс создания семейств
 * взаимосвязных или взаимозависимых объектов без
 * указания их конкретных классов.
 * Отличие от фабричного метода от абстрактной фабрики:
 * фабричный метод представляет абстрактный интерфейс для создания ОДНОГО ПРОДУКТА
 * абстрактная фабрика предоставляет интерфейс для создания взаимосвязных семейств продуктов.
 * Методы создания продуктов в абстрактной фабрике часто реализуются
 * с помощью фабричных методов
 */

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("----- Готовим пиццу: " + pizza.getName() + " -----" );
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
