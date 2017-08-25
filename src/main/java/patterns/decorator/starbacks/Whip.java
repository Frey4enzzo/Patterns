package patterns.decorator.starbacks;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", добавка Сливки";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
