package patterns.decorator.starbacks;

/**
 * Чтобы в объекте Mocha хранилдась ссылка на Beverage,
 * мы создаем переменную beverage типа Beverage в поле объекта Mocha и
 * присваиваем её в конструторе
 */

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    // добавляем к описанию напитка описание добавки
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", добавка Мокко";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
