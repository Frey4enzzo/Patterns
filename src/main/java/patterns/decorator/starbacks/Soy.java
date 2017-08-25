package patterns.decorator.starbacks;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", добавка Соя";
    }

    @Override
    public double cost() {
        return 0.12 + beverage.cost();
    }
}
